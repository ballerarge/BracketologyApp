package edu.rosehulman.decramrj.bracketologyapp.BracketInfo;

import java.util.HashMap;

/**
 * Created by decramrj on 5/20/2017.
 */

public class SeedFactory {
    private final int ONE_SEED = 1;
    private final int TWO_SEED = 2;
    private final int THREE_SEED = 3;
    private final int FOUR_SEED = 4;
    private final int FIVE_SEED = 5;
    private final int SIX_SEED = 6;
    private final int SEVEN_SEED = 7;
    private final int EIGHT_SEED = 8;
    private final int NINE_SEED = 9;
    private final int TEN_SEED = 10;
    private final int ELEVEN_SEED = 11;
    private final int TWELVE_SEED = 12;
    private final int THIRTEEN_SEED = 13;
    private final int FOURTEEN_SEED = 14;
    private final int FIFTEEN_SEED = 15;
    private final int SIXTEEN_SEED = 16;

    public void initializeSeeds(HashMap<Integer, Seed> teamsInRegion) {
        teamsInRegion.put(ONE_SEED, new Seed(ONE_SEED));
        teamsInRegion.put(TWO_SEED, new Seed(TWO_SEED));
        teamsInRegion.put(THREE_SEED, new Seed(THREE_SEED));
        teamsInRegion.put(FOUR_SEED, new Seed(FOUR_SEED));
        teamsInRegion.put(FIVE_SEED, new Seed(FIVE_SEED));
        teamsInRegion.put(SIX_SEED, new Seed(SIX_SEED));
        teamsInRegion.put(SEVEN_SEED, new Seed(SEVEN_SEED));
        teamsInRegion.put(EIGHT_SEED, new Seed(EIGHT_SEED));
        teamsInRegion.put(NINE_SEED, new Seed(NINE_SEED));
        teamsInRegion.put(TEN_SEED, new Seed(TEN_SEED));
        teamsInRegion.put(ELEVEN_SEED, new Seed(ELEVEN_SEED));
        teamsInRegion.put(TWELVE_SEED, new Seed(TWELVE_SEED));
        teamsInRegion.put(THIRTEEN_SEED, new Seed(THIRTEEN_SEED));
        teamsInRegion.put(FOURTEEN_SEED, new Seed(FOURTEEN_SEED));
        teamsInRegion.put(FIFTEEN_SEED, new Seed(FIFTEEN_SEED));
        teamsInRegion.put(SIXTEEN_SEED, new Seed(SIXTEEN_SEED));
    }
}
