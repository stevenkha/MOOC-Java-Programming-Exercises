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
    private GradeRegister register;
    
    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }
    
    public void start() {
        readPoints();
        System.out.println("");
        printGradeDist();
    }
    
    public void readPoints() {
        System.out.println("Enter point totals, -1 stops: ");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            
            this.register.addGradeBasedOnPoints(input);
        }
        
        System.out.println("Point average (all): " + this.register.allAverage());
        if (this.register.passingAverage() == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + this.register.passingAverage());
        }
        System.out.println("Pass percentage: " + this.register.percentage());
        System.out.println("Grade distribution: ");
    }
    
    public void printGradeDist() {
        int grade = 5;
        while (grade >= 0) {
            int stars = this.register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println("");
            grade--;
        }
    }
    
    public void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
