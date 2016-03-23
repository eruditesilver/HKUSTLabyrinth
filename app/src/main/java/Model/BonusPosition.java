package Model;

import java.util.Random;

/**
 * Created by sfwongac on 3/23/2016.
 */
public class BonusPosition extends Position {
    private Bonus bonus;
    public BonusPosition(int x, int y) {
        super(x, y);
        this.bonus = new Bonus();
    }

    public int getBonus(){
       return bonus.getSecondReduce();
    }

    private class Bonus {
        private int secondReduce;
        private final int MAX_REDUCE_TIME_IN_SECOND = 10;
        public Bonus() {
            this.secondReduce = new Random().nextInt(MAX_REDUCE_TIME_IN_SECOND) + 1;
        }

        public int getSecondReduce(){
            return secondReduce;
        }
    }
}
