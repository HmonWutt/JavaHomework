package org.example.dice;

import org.example.menu.Dice;

import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dice die = new Dice(6);
        int roll1 = die.roll();
        System.out.println("The die is: "+ die.getValue());
        int roll2 = die.roll();
        System.out.println("You rolled: "+ roll1 + " and "+ roll2 + ".");

        System.out.println("The sum is: "+ (roll1+roll2));
        System.out.println("The die is: "+ die.toString());
        Scanner scanner = new Scanner(System.in);
        String inpt;
        do{
            System.out.println("Roll dice? [Y/N]");
            inpt = scanner.nextLine();
            if (Objects.equals(inpt, "y") || Objects.equals(inpt, "Y")) {
                die.roll();
                System.out.println(die.toString());}
        }
        while (!Objects.equals(inpt, "n") && !Objects.equals(inpt, "N"));
        scanner.close();

        for (Icecream icecream: Icecream.values()){
            icecream.getFlavour();
            icecream.getPrice();
        }

    }
}