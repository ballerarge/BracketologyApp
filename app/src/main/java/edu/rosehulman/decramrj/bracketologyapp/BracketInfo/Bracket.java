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
        midwest = new Region("Midwest");
        east = new Region("East");
        south = new Region("South");
        west = new Region("West");
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
