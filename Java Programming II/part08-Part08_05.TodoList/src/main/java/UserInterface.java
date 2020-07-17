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
    
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            
            switch(command) {
                case "add":
                    System.out.print("To add: ");
                    String task = scanner.nextLine();
                    this.list.add(task);
                    break;
                case "list":
                    this.list.print();
                    break;
                case "remove":
                    System.out.print("Which one is removed? ");
                    int removeIndex = scanner.nextInt();
                    this.list.remove(removeIndex);
                    break;
            }
            
        }
    }
}
