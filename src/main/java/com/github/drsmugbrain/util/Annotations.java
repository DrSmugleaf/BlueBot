package com.github.drsmugbrain.util;

import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;

/**
 * Created by DrSmugleaf on 21/05/2017.
 */
public class Annotations {

    private static Iterable<Class> getClasses(String packageName) throws ClassNotFoundException, IOException, URISyntaxException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String path = packageName.replace('.', '/');
        Enumeration<URL> resources = classLoader.getResources(path);
        List<File> dirs = new ArrayList<>();

        while (resources.hasMoreElements()) {
            URL resource = resources.nextElement();
            URI uri = new URI(resource.toString());
            dirs.add(new File(uri.getPath()));
        }

        List<Class> classes = new ArrayList<>();
        for (File directory : dirs) {
            classes.addAll(findClasses(directory, packageName));
        }

        return classes;
    }

    private static List<Class> findClasses(File directory, String packageName) throws ClassNotFoundException {
        List<Class> classes = new ArrayList<>();
        if (!directory.exists()) {
            return classes;
        }

        File[] files = directory.listFiles();
        if(files == null) {
            return classes;
        }

        for (File file : files) {
            if (file.isDirectory()) {
                classes.addAll(findClasses(file, packageName + "." + file.getName()));
            }
            else if (file.getName().endsWith(".class")) {
                classes.add(Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6)));
            }
        }
        return classes;
    }

    @Nullable
    public static List<Method> findMethodsWithAnnotations(Class<? extends Annotation> annotation) {
        Iterable<Class> classes = null;
        try {
            classes = Annotations.getClasses("com.github.drsmugbrain.commands");
        } catch(ClassNotFoundException | IOException | URISyntaxException e) {
            Bot.LOGGER.error("Error getting classes in commands package", e);
        }

        List<Method> methodList = new ArrayList<>();
        if(classes == null) return null;
        classes.forEach((Class cls) -> {
            for (Method method : cls.getMethods()) {
                if (method.isAnnotationPresent(annotation)) {
                    methodList.add(method);
                }
            }
        });

        return methodList;
    }

}