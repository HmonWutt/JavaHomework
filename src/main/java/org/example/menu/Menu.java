package org.example.menu;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner;
    public Menu(){
        this.scanner = new Scanner(System.in);
    }
    public void run(){
        String choice = "";
        printMenu();
        do {
            choice = getChoice();
            implementChoice(choice);
        }
        while (!choice.equals("q") && !choice.equals("Q"));
    }
    private void printMenu(){
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
    private String getChoice(){
        System.out.println("Enter your choice: ");
        return scanner.nextLine();
    }
    private void implementChoice(String choice){
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
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
