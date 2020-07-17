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
public class Hold {
    private int maxWeight;
    private int totalWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        this.totalWeight += suitcase.totalWeight();
        if (this.totalWeight <= this.maxWeight) {
            this.suitcases.add(suitcase);
        }
    }
    
    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }
    
    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.totalWeight + " kg)";
    }
}
