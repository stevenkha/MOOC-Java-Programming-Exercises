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
import java.util.ArrayList;

public class BirdCommands {

    private Scanner scanner;
    private Bird bird;
    private ArrayList<Bird> allBirds;

    public BirdCommands(Scanner scanner) {
        this.scanner = scanner;
        this.bird = new Bird(" ", " ");
        this.allBirds = new ArrayList<>();
    }

    public void commands(String command) {
        switch (command) {
            case "Add":
                add();
                break;
            case "Observation":
                observation();
                break;
            case "All":
                all();
                break;
            case "One":
                one();
                break;
        }
    }

    public void add() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Name in Latin: ");
        String latinName = scanner.nextLine();
        
        this.bird = new Bird(name, latinName, this.bird.seenTimes());
        this.allBirds.add(this.bird);
    }
    
    public void observation() {
        System.out.print("Bird? ");
        String obsBird = scanner.nextLine();
        
        for (Bird theBird : this.allBirds) {
            if (theBird.getName().equals(obsBird)) {
                int counter = theBird.seenTimes();
                counter++;
                theBird.setSeenTimes(counter);
            }
        }
    }
    
    public void all() {
        for (Bird birds : this.allBirds) {
            System.out.println(birds.getName() + "(" + birds.getLatName() + "): " + birds.seenTimes() + " observations");
        }
    }
    
    public void one() {
        System.out.print("Bird? ");
        String bird = scanner.nextLine();
        
        for (Bird birds : this.allBirds) {
            System.out.println(birds.getName() + "(" + birds.getLatName() + "): " + birds.seenTimes() + " observations");
        }
    }
    

}

