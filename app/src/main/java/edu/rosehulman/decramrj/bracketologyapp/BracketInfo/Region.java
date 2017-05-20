package edu.rosehulman.decramrj.bracketologyapp.BracketInfo;

import java.util.HashMap;
import java.util.TreeSet;

/**
 * Created by decramrj on 5/20/2017.
 */

public class Region {
    private HashMap<Integer, Seed> teamsInRegion;
    private String location;

    public Region(HashMap<Integer, Seed> teamsInRegion, String location) {
        this.teamsInRegion = teamsInRegion;
        this.location = location;
    }
}
