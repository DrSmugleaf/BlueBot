package com.github.drsmugleaf.database.api;

import com.github.drsmugleaf.BanterBot4J;

import javax.annotation.Nonnull;
import java.lang.reflect.Field;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 * Created by DrSmugleaf on 16/03/2018.
 */
public abstract class Model<T extends Model<T>> {

    static <T extends Model> void createTable(@Nonnull Class<T> model) throws SQLException, InvalidColumnException {
        StringBuilder query = new StringBuilder();
        query
                .append("CREATE TABLE IF NOT EXISTS ")
                .append(escape(getTableName(model)))
                .append(" (");

        List<Field> columns = getColumns(model);
        for (Field column : columns) {
            String name = column.getAnnotation(Column.class).name();
            String type = getDataType(column);

            query
                    .append(name)
                    .append(" ")
                    .append(type);

            if (column.isAnnotationPresent(Column.Id.class)) {
                query.append(" PRIMARY KEY");
            }
        }

        query.append(")");

        PreparedStatement statement = Database.CONNECTION.prepareStatement(query.toString());
        statement.executeUpdate();
    }

    @Nonnull
    private static <T extends Model> String getTableName(@Nonnull Class<T> model) {
        Table tableAnnotation = model.getDeclaredAnnotation(Table.class);
        if (tableAnnotation == null) {
            throw new IllegalArgumentException("Model " + model.getName() + " doesn't have a " + Table.class.getName() + " annotation");
        }

        return tableAnnotation.name();
    }

    @Nonnull
    private static <T extends Model> List<Field> getColumns(@Nonnull Class<T> model) {
        List<Field> fields = new ArrayList<>();

        for (Field field : model.getDeclaredFields()) {
            if (field.isAnnotationPresent(Column.class)) {
                fields.add(field);
            }
        }

        return fields;
    }

    @Nonnull
    private static String getColumnName(@Nonnull Field field) {
        String columnName;
        Column columnAnnotation = field.getDeclaredAnnotation(Column.class);
        Class<?> fieldClass = field.getClass();
        Table tableAnnotation = fieldClass.getDeclaredAnnotation(Table.class);
        if (tableAnnotation == null) {
            columnName = columnAnnotation.name();
        } else {
            columnName = tableAnnotation.name() + "." + columnAnnotation.name();
        }

        return columnName;
    }

    @Nonnull
    private static String escape(@Nonnull String s) throws ModelException {
        try {
            PreparedStatement statement = Database.CONNECTION.prepareStatement("?");
            statement.setString(1, s);
            return statement.toString().replaceFirst("'(.+)'", "$1");
        } catch (SQLException e) {
            throw new ModelException(e);
        }
    }

    private static boolean isID(@Nonnull Field field) {
        return field.isAnnotationPresent(Column.Id.class);
    }

    @Nonnull
    private static String getDataType(@Nonnull Field field) throws InvalidColumnException {
        Column columnAnnotation = field.getAnnotation(Column.class);
        if (columnAnnotation == null) {
            throw new NullPointerException("No column annotation found for field " + field);
        }

        String columnDefinition = field.getAnnotation(Column.class).columnDefinition();
        if (columnDefinition.isEmpty()) {
            Class<?> fieldType = field.getType();
            Types type = Types.getType(PostgresTypes.class, fieldType);
            if (type == null) {
                throw new InvalidColumnException("No type exists for class " + fieldType.getName());
            }

            return type.getName();
        } else {
            return columnDefinition;
        }
    }

    static <T extends Model> void validate(Class<T> model) {
        for (Field field : getColumns(model)) {
            if (field.getType().isPrimitive()) {
                throw new ModelException("Field " + field + " in model " + model.toString() + " is primitive");
            }
        }
    }

    protected abstract T getInstance();

    @Nonnull
    public final List<T> get() throws ModelException {
        T model = getInstance();
        List<T> models = new ArrayList<>();

        PreparedStatement statement;
        StringBuilder query = new StringBuilder();
        query
                .append("SELECT * FROM ")
                .append(escape(getTableName(model.getClass())));

        Set<Map.Entry<Field, Object>> fields = getFields(model).entrySet();
        if (!fields.isEmpty()) {
            query.append(" WHERE ");
        }

        Iterator<Map.Entry<Field, Object>> iterator = fields.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Field, Object> entry = iterator.next();
            String columnName = getColumnName(entry.getKey());

            query
                    .append(columnName)
                    .append(" = ?");

            if (iterator.hasNext()) {
                query.append(" AND ");
            }
        }

        try {
            statement = Database.CONNECTION.prepareStatement(query.toString());

            int i = 1;
            for (Map.Entry<Field, Object> column : fields) {
                statement.setObject(i, column.getValue());
                i++;
            }

            ResultSet result = statement.executeQuery();
            while (result.next()) {
                T row = newInstance(model);
                for (Map.Entry<Field, Object> entry : fields) {
                    Field field = entry.getKey();
                    Column columnAnnotation = field.getAnnotation(Column.class);
                    field.set(row, result.getObject(columnAnnotation.name()));
                }
                models.add(row);
            }
        } catch (SQLException | IllegalAccessException | InstantiationException e) {
            throw new ModelException(e);
        }

        return models;
    }

    public final void createIfNotExists() throws ModelException {
        T model = getInstance();
        StringBuilder query = new StringBuilder();
        StringBuilder queryInsert = new StringBuilder();
        StringBuilder queryValues = new StringBuilder();
        StringBuilder queryConflict = new StringBuilder();

        queryInsert
                .append("INSERT INTO ")
                .append(escape(getTableName(model.getClass())))
                .append(" (");
        queryValues.append("VALUES(");
        queryConflict.append("ON CONFLICT DO NOTHING");

        Set<Map.Entry<Field, Object>> fields = getFields(model).entrySet();
        Iterator<Map.Entry<Field, Object>> iterator = fields.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Field, Object> entry = iterator.next();
            Field field = entry.getKey();
            String columnName = getColumnName(field);

            queryInsert.append(columnName);
            queryValues.append("?");

            if (iterator.hasNext()) {
                queryInsert.append(", ");
                queryValues.append(", ");
            } else {
                queryInsert.append(") ");
                queryValues.append(") ");
            }
        }

        query
                .append(queryInsert)
                .append(queryValues)
                .append(queryConflict);

        try {
            PreparedStatement statement = Database.CONNECTION.prepareStatement(query.toString());
            iterator = fields.iterator();
            int i = 1;
            while (iterator.hasNext()) {
                Map.Entry<Field, Object> entry = iterator.next();
                Object value = entry.getValue();
                statement.setObject(i, value);
            }

            statement.executeUpdate();
        } catch (SQLException e) {
            throw new ModelException(e);
        }
    }

    public final void save() throws ModelException {
        T model = getInstance();
        StringBuilder query = new StringBuilder();
        StringBuilder queryInsert = new StringBuilder();
        StringBuilder queryValues = new StringBuilder();
        StringBuilder queryConflict = new StringBuilder();
        StringBuilder querySet = new StringBuilder();

        queryInsert
                .append("INSERT INTO ")
                .append(escape(getTableName(model.getClass())))
                .append(" (");
        queryValues.append("VALUES(");
        queryConflict.append("ON CONFLICT (");
        querySet.append("DO UPDATE SET ");

        Set<Map.Entry<Field, Object>> fields = getFields(model).entrySet();
        Iterator<Map.Entry<Field, Object>> iterator = fields.iterator();
        while (iterator.hasNext()) {
            Field field = iterator.next().getKey();
            String columnName = getColumnName(field);

            queryInsert.append(columnName);
            queryValues.append("?");
            if (isID(field)) {
                queryConflict.append(columnName);
            }
            querySet
                    .append(columnName)
                    .append(" = ?");

            if (iterator.hasNext()) {
                queryInsert.append(", ");
                queryValues.append(", ");
                if (isID(field)) {
                    queryConflict.append(", ");
                }
                querySet.append(", ");
            } else {
                queryInsert.append(") ");
                queryValues.append(") ");
                queryConflict.append(") ");
                querySet.append(" ");
            }
        }

        query
                .append(queryInsert)
                .append(queryValues)
                .append(queryConflict)
                .append(querySet);

        try {
            PreparedStatement statement = Database.CONNECTION.prepareStatement(query.toString());
            iterator = fields.iterator();
            int i = 1;
            int size = fields.size();
            while (iterator.hasNext()) {
                Map.Entry<Field, Object> entry = iterator.next();
                Object value = entry.getValue();
                statement.setObject(i, value);
                statement.setObject(i + size, value);
                i++;
            }

            statement.executeUpdate();
        } catch (SQLException e) {
            throw new ModelException(e);
        }
    }

    @Nonnull
    private Map<Field, Object> getFields(@Nonnull T model) {
        Map<Field, Object> fields = new HashMap<>();

        for (Field column : getColumns(model.getClass())) {
            column.setAccessible(true);

            Object value;
            try {
                value = column.get(model);
            } catch (IllegalAccessException e) {
                BanterBot4J.LOGGER.error("Error getting value from field", e);
                continue;
            }

            fields.put(column, value);
        }

        return fields;
    }

    @Nonnull
    @SuppressWarnings("unchecked")
    private T newInstance(@Nonnull T model) throws IllegalAccessException, InstantiationException {
        return (T) model.getClass().newInstance();
    }

}
