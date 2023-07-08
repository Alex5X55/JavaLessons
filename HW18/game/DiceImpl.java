package HW18.game;

import java.util.Random;

public class DiceImpl implements Dice {
    @Override
    public int roll() {
       return new Random().nextInt();
    }

    @Override
    public int roll(int min, int max) {
        return new Random().nextInt(1,6);
    }
}
