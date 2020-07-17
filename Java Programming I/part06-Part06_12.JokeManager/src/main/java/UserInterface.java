/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
import java.util.Scanner;

public class UserInterface {

    private JokeManager jokes;
    private Scanner scanner;

    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.jokes = jokes;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {

            menu();
            String input = scanner.nextLine();
            if (input.equals("X")) {
                break;
            }

            commands(input);
        }
    }

    public void commands(String command) {

        switch (command) {
            case "1":
                addJokes();
                break;
            case "2":
                drawJokes();
                break;
            case "3":
                printJokes();
                break;
        }
    }

    public void addJokes() {
        System.out.println("Write the jokes to be added: ");
        String addJoke = scanner.nextLine();
        this.jokes.addJoke(addJoke);
    }

    public void drawJokes() {
        System.out.println(this.jokes.drawJoke());
    }

    public void printJokes() {
        System.out.println("Printing the jokes.");
        this.jokes.printJokes();
    }

    public void menu() {
        System.out.println("Commands: ");
        System.out.println("1 - add a joke");
        System.out.println("2 - draw a joke");
        System.out.println("3 - list jokes");
        System.out.println("X - stop");
    }
}
