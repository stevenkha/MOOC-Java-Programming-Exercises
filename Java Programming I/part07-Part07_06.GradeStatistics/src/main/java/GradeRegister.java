/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
import java.util.ArrayList;

public class GradeRegister {
    
    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;
    
    public GradeRegister() {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
    }
    
    public void addGradeBasedOnPoints(int points) {
        if (points <= 100 && points > 0) {
            this.grades.add(pointsToGrade(points));
            this.points.add(points);
        }    
    }
    
    public int numberOfGrades(int number) {
        int count = 0;
        for (int grades : this.grades) {
            if (grades == number) {
                count++;
            }
        }
        
        return count;
    }
    
    public int pointsToGrade(int points) {
        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else if (points >= 90) {
            grade = 5;
        }
        
        return grade;
    }
    
    public double allAverage() {

        int totalPoints = 0;
        for (int number : points) {
            totalPoints += number;
        }
        
        return (double) totalPoints / this.points.size();
    }
    
    public double passingAverage() {
        
        int counter = 0;
        int passingTotal = 0;
        for (int number : points) {
            if (number >= 50) {
                passingTotal += number;
                counter++;
            }
        }
        
        if (passingTotal == 0) {
            return passingTotal;
        }
        
        return (double) passingTotal / counter;
    }
    
    public double percentage() {
        double passingCounter = 0;
        for (int number : points) {
            if (number >= 50) {
                passingCounter++;
            }
        }
        
        return 100 * passingCounter / this.points.size();
    }
}
