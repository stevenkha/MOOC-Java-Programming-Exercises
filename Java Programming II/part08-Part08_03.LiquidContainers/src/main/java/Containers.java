/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class Containers {

    private int firstContainerAmount;
    private int secondContainerAmount;

    public Containers() {
        this.firstContainerAmount = 0;
        this.secondContainerAmount = 0;
    }
    
    public int getFirst() {
        return this.firstContainerAmount;
    }
    
    public int getSecond() {
        return this.secondContainerAmount;
    }

    public void add(int amount) {
        this.firstContainerAmount += amount;
        checkOver();
    }

    public void move(int amount) {
        if (this.firstContainerAmount == 0) {
            return;
        } else if (this.firstContainerAmount - amount <= 0) {
            this.secondContainerAmount += this.firstContainerAmount;
            this.firstContainerAmount -= amount;
            checkEmpty();
            return;
        } 
        
        this.secondContainerAmount += amount;
        this.firstContainerAmount -= amount;
        
        checkOver();
    }
    
    public void remove(int amount) {
        if (this.secondContainerAmount == 0) {
            return;
        }
        
        this.secondContainerAmount -= amount;
        checkEmpty();
    }
    
    public void checkEmpty() {
        if (this.firstContainerAmount < 0) {
            this.firstContainerAmount = 0;
        }
        
        if (this.secondContainerAmount < 0) {
            this.secondContainerAmount = 0;
        }
    }
    
    public void checkOver() {
        if (this.firstContainerAmount > 100) {
            this.firstContainerAmount = 100;
        }
        
        if (this.secondContainerAmount > 100) {
            this.secondContainerAmount = 100;
        }
    }
    
    public void print() {
        System.out.println("First: " + this.firstContainerAmount + "/100");
        System.out.println("Second: " + this.secondContainerAmount + "/100");
    }
}
