package edu.rosehulman.decramrj.bracketologyapp;

/**
 * Created by decramrj on 5/20/2017.
 */

public class Bracket {
    private Region midwest;
    private Region east;
    private Region south;
    private Region west;

    public Bracket() {
        midwest = new Region();
        east = new Region();
        south = new Region();
        west = new Region();
    }
}
