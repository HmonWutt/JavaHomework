package org.example.A011;
import java.util.Random;

public class Dice {
    private final int sides;
    private int lastRoll;
    private final String[] diceGraphics = {"⚀", "⚁", "⚂", "⚃", "⚄", "⚅"};
    public Dice(int sides){
        this.sides = sides;
    }
    public int roll(){
        Random random = new Random();
        this.lastRoll = 1 + random.nextInt(sides);
        return lastRoll;
    }
    public String toString(){
        return diceGraphics[lastRoll-1];
    }

    public int getValue(){
        return lastRoll;
    }

}