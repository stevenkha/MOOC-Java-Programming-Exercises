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

public class Box implements Packable {
    
    private double maxCapacity;
    private ArrayList<Packable> item;
    
    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.item = new ArrayList<>();
    }
    
    public void add(Packable item) {
        if (weight() + item.weight() < maxCapacity) {
            this.item.add(item);
        }
    }
    
    @Override
    public double weight() {
        double totalWeight = 0;
        for (Packable item : this.item) {
            totalWeight += item.weight();
        }
        
        return totalWeight;
    }
    
    @Override
    public String toString() {
        return "Box: " + this.item.size() + " items, total weight " + weight() + " kg";
    }
    
    
}
