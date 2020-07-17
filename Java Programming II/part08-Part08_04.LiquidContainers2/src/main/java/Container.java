/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class Container {
    
    private int containerAmount;
    
    public Container() {
        this.containerAmount = 0;
    }
    
    public int contains() {
        return this.containerAmount;
    }
    
    public void add(int amount) {
        this.containerAmount += amount;
        checkOver();
    }
    
    public void remove(int amount) {
        this.containerAmount -= amount;
        checkUnder();
    }
    
    public void checkOver() {
        if (this.containerAmount > 100) {
            this.containerAmount = 100;
        }
    }
    
    public void checkUnder() {
        if (this.containerAmount < 100) {
            this.containerAmount = 0;
        }
    }
    
    public String toString() {
        return this.containerAmount + "/100";
    }
}
