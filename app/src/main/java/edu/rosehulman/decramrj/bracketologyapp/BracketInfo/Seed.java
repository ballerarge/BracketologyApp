package edu.rosehulman.decramrj.bracketologyapp.BracketInfo;

/**
 * Created by decramrj on 5/20/2017.
 */

public class Seed {
    public final Team EMPTY_TEAM = new Team("EMPTY");
    private int seedNumber;
    private Team team;

    public Seed(int seedNumber) {
        this.seedNumber = seedNumber;
        this.team = EMPTY_TEAM;
    }

    public Seed(int seedNumber, Team team) {
        this.seedNumber = seedNumber;
        this.team = team;
    }

    public int getSeedNumber() {
        return seedNumber;
    }

    public Team getTeam() {
        return team;
    }
}
