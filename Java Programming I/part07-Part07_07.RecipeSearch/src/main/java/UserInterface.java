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

    private Scanner scanner;
    private RecipeCommands recipeFunction;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.recipeFunction = new RecipeCommands(scanner);
    }

    public void start() {
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();

        this.recipeFunction.start(fileName);

        while (true) {
            System.out.println("Commands: \nlist - lists the recipes\nstop - stops the program\n" +
                               "find name - searches recipes by name\nfind cooking time - searches by cooking time\n" +
                               "find ingredient - searches for recipes by ingredient\n");
            System.out.print("Enter command: ");
            String command = String.valueOf(scanner.nextLine());
            System.out.println("");
            if (command.equals("stop")) {
                break;
            }
            this.recipeFunction.command(command);
        }
    }
}
