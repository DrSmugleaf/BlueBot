package com.github.drsmugbrain.dungeon;

/**
 * Created by Brian on 16/05/2017.
 */
public class Tile {
    private static final String ALLOWED_CHARS = "-# @";

    private char type;

    public Tile(char type){
        this.type = type;
    }

    private static boolean tileTypeIsValid(char type){
        return ALLOWED_CHARS.indexOf(type) != -1;
    }

    @Override
    public String toString(){
        return String.valueOf(this.type);
    }

    public static Tile[] stringToTileRow(String input){
        return Tile.charRowToTileRow(input.toCharArray());
    }

    public static Tile[] charRowToTileRow(char[] charRow){
        Tile[] result = new Tile[charRow.length];
        for (int i = 0; i<charRow.length; i++){
            Tile tile = new Tile(charRow[i]);
            result[i] = tile;
            System.out.println(tile.toString());
        }

        return result;
    }
}