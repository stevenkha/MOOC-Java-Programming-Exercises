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
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpObject;
    
    public TextUI (Scanner scanner, SimpleDictionary simpObject) {
        this.scanner = scanner;
        this.simpObject = simpObject;
    }
    
    public void start() {
        
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if (command.equals("end")) {
                break;
            }
            
            processCommand(command);
            System.out.println("");
        }
        
        System.out.println("Bye bye!");
    }
    
    public void processCommand(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("search")) {
            search();
        } else {
            System.out.println("Unknown Command");
        }
    }
    
    public void add() {
        System.out.print("Word: ");
        String word = scanner.nextLine();
        System.out.print("Translation: ");
        String translation = scanner.nextLine();
        this.simpObject.add(word, translation);
    }
    
    public void search() {
        System.out.print("To be translated: ");
        String toTranslate = scanner.nextLine();
        
        if (this.simpObject.translate(toTranslate) == null) {
            System.out.println("Word " + toTranslate + " was not found");
        } else {
            System.out.println("Translation: " + this.simpObject.translate(toTranslate));
        }
    }
}
