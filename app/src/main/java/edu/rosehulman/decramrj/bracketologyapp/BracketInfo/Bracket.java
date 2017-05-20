package edu.rosehulman.decramrj.bracketologyapp.BracketInfo;

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

    public Region getMidwest() {
        return midwest;
    }

    public Region getEast() {
        return east;
    }

    public Region getSouth() {
        return south;
    }

    public Region getWest() {
        return west;
    }
}
