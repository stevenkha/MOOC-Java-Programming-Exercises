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

public class ChangeHistory {
    
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status) {
        this.history.add(status);
    }
    
    public void clear() {
        this.history.clear();
    }
    
    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        
        double max = 0;
        for (double number : this.history) {
            if (number > max) {
                max = number;
            }
        }
        
        return max;
    }
    
    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        
        double min = maxValue();
        for (double number : this.history) {
            if (number < min) {
                min = number;
            }
        }
        
        return min;
    }
    
    public double average() {
        if (this.history.isEmpty()) {
            return 0;
        }
        
        double sum = 0;
        for (double number : this.history) {
            sum += number;
        }
        
        return sum / this.history.size();
    }
    
    public String toString() {
        return this.history.toString();
    }
}
