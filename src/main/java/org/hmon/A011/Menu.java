package org.hmon.A011;

import org.hmon.resource.MenuTwo;

import java.util.Scanner;

public class Menu {
    public static  void run(){
        String choice = "";
        printMenu();
        do {
            choice = getChoice();
            implementChoice(choice);
        }
        while (!choice.equals("q") && !choice.equals("Q"));
    }
    private static void printMenu(){
        System.out.println(
                " -----------------\n" +
                "| 1) Menu choice 1\n" +
                "| 2) Menu choice 2\n" +
                "| 3) Menu choice 3\n" +
                "| m) Print menu\n" +
                "| qQ) Quit\n" +
                " -----------------\n"
        );
    }
    private static String getChoice(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your choice: ");
        return scanner.nextLine();
    }
    private static void implementChoice(String choice){
        switch (choice){
            case "1":
                Avatar.print();
                break;
            case "2":
                Time.print();
                break;
            case "3":
                DiceGame21.main(new String[]{});
                break;
            case "m":
            case "M":
                printMenu();
                break;
            case "q":
            case "Q":
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    public static void main(String[] args){
        Menu.run();

    }
}
