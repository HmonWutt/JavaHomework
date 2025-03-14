package org.hmon.A011;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Player{
    private final String name;
    private int points = 0;
    public Player(String name){
        this.name = name;
    }
    public void play(Scanner scanner, Dice die) {
            if (scanner != null) rollOneByOne(die, scanner);
    }
    public void play(Dice die){
        System.out.printf("%s is playing....\n",name);
        Random random = new Random();
        int methodToCall = random.nextInt(2) + 1;
        if (methodToCall == 1) {
            rollOneByOne(die);
        } else {
            rollAllAtOnce(die);
        }
        System.out.printf("%s's total points: %d\n", name,points);
    }
    private void rollOneByOne(Dice die,Scanner scanner) {
        int count = 0;
        String isRollAgain = "y";
        do {
            System.out.println("Roll the dice? y/n: ");
            isRollAgain = scanner.next().toLowerCase();
            die.roll();
            int face = die.getValue();
            points += face;
            System.out.printf("Round %d, %s's total points: %d\n", count+1,name,points);
            count ++;
        }
        while (count < 5 && !isRollAgain.equals("n") && points < 21);
    }
    private void rollOneByOne(Dice die){
        int count = 0;
        while (count <5 && points <=17){
            die.roll();
            int face = die.getValue();
            points+=face;
            count++;
        }
    }
    private void rollAllAtOnce(Dice die){
        for (int i =0; i < 6; i++) {
            die.roll();
            points += die.getValue();
        }
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

}
