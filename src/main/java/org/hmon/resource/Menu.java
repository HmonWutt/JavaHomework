package org.hmon.resource;

import java.util.Scanner;

public class Menu{
    private Team team;
    private final Scanner scanner;
    public Menu(Scanner scanner){
        this.scanner = scanner;
    }
    public void printMenu(){
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
    public void chooseMenu(String input) {
        scanner.nextLine();
        switch (input) {
            case "1":
                this.team = new Team();
                System.out.println(team.toString());
                break;
            case "2":
                System.out.println("# Create new NormalEmployee");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                System.out.println("Enter work: ");
                String work = scanner.next();
                int salary = 0;
                while (true) {
                    System.out.println("Enter salary: ");
                    try{
                        salary = scanner.nextInt();
                        break;
                    }
                    catch (Exception InputMismatchException) {
                        System.out.println("Please Enter an integer.");
                        scanner.nextLine();
                    }
                }

                Employee employee = new NormalEmployee(name,work,salary);
                System.out.println("name"+name);
                this.team.add(employee);
                System.out.println(team.toString());
                break;
            case "3":
                Employee jane = new NormalEmployee("Jane Doe","IT",30000);
                Employee john = new NormalEmployee("John Doe","Economic",30000);
                Employee little = new NormalEmployee("Little JR Doe","Trainee",10000);
                team.add(jane);
                team.add(john);
                team.add(little);
                System.out.println(team.toString());
                break;
            case "4":
                System.out.println("# TEAM is working:");
                System.out.println(team.work());
                break;
            case "5":
                Employee superEmployee = new SuperEmployee("Clark Kent","IT");
                team.add(superEmployee);
                System.out.println(team.toString());
                break;
            case "6":
                SuperPower excel = new SuperPower("Excel wizard", "Create macros at supersonic speeds.");
                SuperPower invisibility = new SuperPower("Invisibility", "Go disappearing during crises.");
                SuperPower telepathy = new SuperPower("Telepathy","Never listens.");
                SuperPower omnipotence = new SuperPower("Omnipotent nose","Their nose is in everyone's business everywhere.");
                Employee superEmployee1 = new SuperEmployee("David Smith","Public relations");
                ((SuperEmployee) superEmployee1).addPower(excel);
                team.add(superEmployee1);
                Employee superEmployee2 = new SuperEmployee("Jessica Jones","Finance");
                ((SuperEmployee) superEmployee2).addPower(invisibility);
                ((SuperEmployee) superEmployee2).addPower(telepathy);
                team.add(superEmployee2);
                Employee superEmployee3 = new SuperEmployee("Wade Wilson","Investigations");
                ((SuperEmployee) superEmployee3).addPower(omnipotence);
                team.add(superEmployee3);
                System.out.println(team.toString());;
                break;
            case "7":
                break;
            case "m":
            case "M":
                printMenu();
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
        Menu menu = new Menu(scanner);
        menu.printMenu();
        String choice = "";
        do{
            choice = scanner.next();
            menu.chooseMenu(choice);
        }
        while (!choice.equals("q"));

    }

}