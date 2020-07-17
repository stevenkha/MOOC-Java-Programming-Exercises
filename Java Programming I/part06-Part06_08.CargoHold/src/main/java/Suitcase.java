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
public class Suitcase {
    private ArrayList<Item> items;
    private int totalWeight;
    private int maxWeight;
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.totalWeight = 0;
        items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        this.totalWeight += item.getWeight();
        if (this.totalWeight <= this.maxWeight) {
            items.add(item);
        } else {
            this.totalWeight -= item.getWeight();
        }
    }
    
    public void printItems() {
        int index = 0;
        while (index < this.items.size()) {
            System.out.println(this.items.get(index));
            index++;
        }
   }
    
    public int totalWeight() {
        return this.totalWeight;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item toReturn = this.items.get(0);
        
        for (Item items : items) {
            if (toReturn.getWeight() < items.getWeight()) {
                toReturn = items;
            }
        }
        
        return toReturn;
    }
    
    public String toString() {
        if (this.items.size() == 1) {
            return this.items.size() + " item " + "(" + this.totalWeight + " kg)";
        } else if (this.items.isEmpty()) {
            return "no items " + "(" + this.totalWeight + " kg)";
        }
         return items.size() + " items " + "(" + this.totalWeight + " kg)";
    }
}
