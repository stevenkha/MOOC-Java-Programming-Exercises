/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
import java.util.HashMap;
        
public class IOU {
    
    private HashMap<String,Double> tracker;
    
    public IOU() {
        this.tracker = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        //saves amount owed and the person owed to to the IOU
        this.tracker.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        //returns the amount owed to the person whose name is the parameter. If person is not found return 0
        return this.tracker.getOrDefault(toWhom, (double) 0);
    }
}
