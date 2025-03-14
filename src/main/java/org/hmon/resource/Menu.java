package org.hmon.resource;

import java.util.Scanner;

public class Menu{
    public static void printMenu(){
        System.out.println("-----------------\n"+
                "| 1) Create a new empty team\n"+
                "| 2) Add normal employee to team\n"+
                "| 3) Add John, Jane and little Jr\n"+
                "| 4) Print out work being done\n"+
                "| 5) Add super employee to team\n"+
                "| 6) Add three super employee, with powers, to team\n"+
                "| 7) Salary report\n"+
                "| m) Print menu\n"+
                "| qQ) Quit\n"+
                "-----------------\n"+
                "Enter your choice:");
    }
    public static void chooseMenu(String input) {
        switch (input) {
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                break;
            case "7":
                break;
            case "m":
            case "M":
                break;
            case "q":
            case "Q":
                return;
            default:
                System.out.println("Invalid choice!");

        }
    }
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        printMenu();
        String choice = "";
        do{
            System.out.println("Enter your choice: ");
            choice = scanner.next();
            chooseMenu(choice);
        }
        while (!choice.equals("q"));

    }

}