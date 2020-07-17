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
    
    private BirdCommands commands;
    private Scanner scanner;
    
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.commands = new BirdCommands(scanner);
        
    }
    
    public void start() {
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();
            
            if (command.equals("Quit")) {
                break;
            }
            
            this.commands.commands(command);
            
        }
    }
}
