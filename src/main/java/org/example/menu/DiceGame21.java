package org.example.menu;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class DiceGame21 {

    private ArrayList<Player> players = new ArrayList<>();
    private final Scanner scanner;
    public DiceGame21(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run(){
        String name = "Marvin";
        name = askName();
        Player player = new Player(name, true, scanner);
        this.players.add(player);
        Player marvin = new Player("Marvin", false, scanner);
        this.players.add(marvin);
        startGame();
    }

    private void startGame(){
        Dice die = new Dice(6);
        if (!players.isEmpty()) {
            Player human = players.get(0);
            Player marvin = players.get(1);
            human.play(scanner, die);
            if (human.isLost()) {
                System.out.printf("You rolled a %d, %s won by default.\n", human.getPoints(), marvin.getName());
            }
            else {
                marvin.play(die);
                declareWinner(human,marvin);
            }
        }
    }

    private void declareWinner(Player human, Player robot){
        if (robot.getPoints() >= 21) {
            System.out.printf("%s has won with %d points.\n", human.getName(),human.getPoints());
            System.out.printf("%s has lost with %d points.\n",robot.getName(),robot.getPoints());
        }
        else if (robot.getPoints() == human.getPoints()){
            System.out.printf("You lost!%s won!\n",robot.getName());
        }
        else {
            System.out.printf("%s has won with %d points.\n", robot.getName(), robot.getPoints());
            System.out.printf("%s has lost with %d points.\n", human.getName(), human.getPoints());
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
        String newGame = "y";
        do {
            DiceGame21 game = new DiceGame21(scanner);
            game.run();
            System.out.println("Play a new game?");
            newGame = scanner.next();
        } while (!newGame.equals("n"));
    }

}
