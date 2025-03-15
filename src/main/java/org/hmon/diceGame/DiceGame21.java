package org.hmon.diceGame;

import java.util.Scanner;

public class DiceGame21 {
    private final Scanner scanner;
    public DiceGame21(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run(){
        String name = "Marvin";
        name = askName();
        Player human = new Player(name);
        Player marvin = new Player("Marvin");
        decideWinner(human,marvin);
    }

    private void decideWinner(Player human, Player robot) {
        Dice die = new Dice(6);
        human.play(scanner, die);
        int humanPoints = human.getPoints();
        if (humanPoints > 21) {
            System.out.printf("Womp, womp!You rolled a %d, %s won by default.\n", humanPoints, robot.getName());
        } else if (humanPoints == 21) {
            System.out.println("You rolled a 21. You won!");
        }
         else {
                robot.play(die);
                int robotPoints = robot.getPoints();
                if (robotPoints > 21) System.out.printf("%s got %d and lost. You won",robot.getName(),robotPoints);
                else if (robotPoints >= humanPoints) {
                    System.out.printf("%s won with %d points.\n", robot.getName(), robotPoints);
                    System.out.printf("You lost with %d points.\n", humanPoints);
                } else {
                    System.out.printf("You win with %d points.\n", humanPoints);
                    System.out.printf("%s lost with %d points.\n", robot.getName(), robotPoints);
                }
            }
        }

    private String askName(){
        String name = "";
        System.out.print("Enter your name: ");
        if (scanner.hasNext()) {
            name = scanner.next();
        } else {
            System.out.println("Invalid input! The name cannot be empty.");
        }
        return name;
    }

    public static void main(String[] args) {
        final Scanner scanner  = new Scanner(System.in);
        String newGame = "";
        do {
            System.out.print("Do you want to play? (y/n): ");
            newGame = scanner.next();

            if (newGame.equalsIgnoreCase("y")) {
                DiceGame21 game = new DiceGame21(scanner);
                game.run();
            }
        } while (!newGame.equalsIgnoreCase("n"));

        System.out.println("Game over. Thanks for playing!");
    }
}
