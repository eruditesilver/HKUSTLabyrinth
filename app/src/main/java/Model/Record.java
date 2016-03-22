package Model;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Silver on 12/3/2016.
 */
public class Record {
    public final static int MAX_CLEAR_LEVEL = 3;

    private int level;
    private int durationInSecond;
    private int steps;

    public void setLevel(int level) {
        List<Integer> intList = new ArrayList<Integer>();
        for (int index = 0; index < GameConFig.LEVEL.length; index++) {
            intList.add(GameConFig.LEVEL[index]);
        }
        if (intList.contains(level)) {
            this.level = level;
        }
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public void setDurationInSecond(int durationInSecond) {
        this.durationInSecond = durationInSecond;
    }

    public int getScore() {
        int penalty = Math.abs(GameConFig.STEP_TO_CLEAR[level] - steps);
        return level * 1000 - durationInSecond / 1000 - penalty;
    }

    public int getClearedLevel() {
        int MAX_SCORE = level * 1000;
        int MIN_SCORE = level * 1000 - 60 / 1000 - GameConFig.STEP_TO_CLEAR[level];
        for (int i = 0; i < MAX_CLEAR_LEVEL; i++) {
            if (getScore() < (MAX_SCORE - MIN_SCORE) / MAX_CLEAR_LEVEL * i) {
                return i;
            }
        }
        return 0;
    }

    public int getDurationInSecond() {
        return durationInSecond;
    }

    public int getSteps() {
        return steps;
    }

    public int getLevel() {
        return level;
    }
}
