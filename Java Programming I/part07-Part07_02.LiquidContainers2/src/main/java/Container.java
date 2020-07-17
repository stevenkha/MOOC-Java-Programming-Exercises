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
    
    private int amountLiquid;
    private int secondLiquid;
    
    public Container() {
        this.amountLiquid = 0;
        this.secondLiquid = 0;
    }
    
    public int contains() {
        return this.amountLiquid;
    }
    
    public int secondContains() {
        return this.secondLiquid;
    }

    
    public void add(int amount) {
        if (amount > 0) {
            this.amountLiquid += amount;
        }
        
        over();
    }
    
    public void remove(int amount) {
        if (amount > 0) {
            this.secondLiquid -= amount;
        }

        under();
    }
    
    public void move(int amount) { 
        if (amount > this.amountLiquid) {
            this.secondLiquid = this.amountLiquid;
            this.amountLiquid -= amount;
        } else if (this.amountLiquid != 0) {
            this.secondLiquid += amount;
            this.amountLiquid -= amount;
        }

        
        under();
        over();
             
    }
    
    public void over() {     
        if (this.amountLiquid > 100) {
            this.amountLiquid = 100;
        }
        
        if (this.secondLiquid > 100) {
            this.secondLiquid = 100;
        }
    }
    
    public void under() {
        if (this.amountLiquid < 0) {
            this.amountLiquid = 0;
        }
        
        if (this.secondLiquid < 0) {
            this.secondLiquid = 0;
        }
    }
    
    public String toString() {
        return this.amountLiquid + "/100";
    }
}
