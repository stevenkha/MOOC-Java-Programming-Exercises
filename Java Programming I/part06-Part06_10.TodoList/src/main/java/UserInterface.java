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
            String input = scanner.nextLine();
            
            if (input.equals("stop")) {
                break;
            }
            
            command(input);
            System.out.println("");      
        }
        
        
    }

    public void command(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("list")) {
            list();
        } else if (command.equals("remove")) {
            remove();
        }
    }
    
    public void add() {
        System.out.print("To add: ");
        String toAdd = scanner.nextLine();
        list.add(toAdd);
    }
    
    public void list() {
        list.print();
    }
    
    public void remove() {
        System.out.print("Which one to remove? ");
        int index = scanner.nextInt();
        list.remove(index);
    }
}
