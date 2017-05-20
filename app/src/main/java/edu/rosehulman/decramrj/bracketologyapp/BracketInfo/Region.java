package edu.rosehulman.decramrj.bracketologyapp.BracketInfo;

import java.util.HashMap;
import java.util.TreeSet;

/**
 * Created by decramrj on 5/20/2017.
 */

public class Region {
    private HashMap<Integer, Seed> teamsInRegion;
    private String location;
    private SeedFactory seedFactory;

    public Region(String location) {
        this.teamsInRegion = new HashMap<>();
        this.location = location;
        seedFactory = new SeedFactory();
        initializeRegion();
    }

    private void initializeRegion() {
        seedFactory.initializeSeeds(teamsInRegion);
    }

    public HashMap<Integer, Seed> getTeamsInRegion() {
        return teamsInRegion;
    }

    public String getLocation() {
        return location;
    }


}
