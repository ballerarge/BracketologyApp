package edu.rosehulman.decramrj.bracketologyapp.BracketInfo;

/**
 * Created by decramrj on 5/20/2017.
 */

public class Team {
    private String teamName;
    private String record;

    public Team(String name) {
        this.teamName = name;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }
}
