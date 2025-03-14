package org.hmon.A011;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Player{
    private final String name;
    private int points = 0;
    private boolean isLost;
    public Player(String name, Scanner scanner){
        this.name = name;
    }
    public void play(Scanner scanner, Dice die) {
            if (scanner != null) {
                System.out.println("Press 1 to choose to roll dices one by one.\nPress 2 to roll all dices at once.");
                String strategy = scanner.next();
                if (Objects.equals(strategy, "1")) {
                    rollOneByOne(die, scanner);
                } else rollAllAtOnce(die);
            }
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
            count ++;
            System.out.printf("%s's total points: %d\n", name,points);
        }
        while (count < 6 && !isRollAgain.equals("n") && points < 21);
        if (points >= 21) {
            System.out.println("Womp, womp! You lost!");
            isLost = true;
        }
    }
    private void rollOneByOne(Dice die){
        int count = 0;
        while (count <6 && points <=15){
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
        if (points >=21) isLost = true;
    }
    public boolean isLost() {
        return isLost;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

}
