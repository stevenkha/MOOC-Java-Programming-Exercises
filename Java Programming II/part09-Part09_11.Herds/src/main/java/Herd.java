/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
import java.util.List;
import java.util.ArrayList;

public class Herd implements Movable {

    private final List<Movable> objects;
    
    public Herd() {
        this.objects = new ArrayList<>();
    }
    
    public void addToHerd(Movable moveable) {
        this.objects.add(moveable);
    }
    @Override
    public void move(int dx, int dy) {
        for (Movable object : this.objects) {
            object.move(dx, dy);
        }
    }
    
    @Override
    public String toString() {
        String output = "";
        for (Movable object : this.objects) {
            output = output + object.toString() + "\n";
        }
        
        return output;
    }
    
}
