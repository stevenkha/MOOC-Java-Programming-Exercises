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

public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        int totalWeight = 0;

        for (Item items : this.items) {
            totalWeight += items.getWeight();
        }
        
        int addedWeight = totalWeight + item.getWeight();
        
        if (addedWeight > this.capacity) {
            return;
        }

        if (item.getWeight() > this.capacity) {
            return;
        }
        
        this.items.add(item);

    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }

}
