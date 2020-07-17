/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class Bird {
    
    private String name;
    private String latinName;
    private int seen;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }
    public Bird(String name, String latinName, int seen) {
        this.name = name;
        this.latinName = latinName;
        this.seen = seen;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getLatName() {
        return this.latinName;
    }
    
    public int seenTimes() {
        return this.seen;
    }
    
    public void setSeenTimes(int counter) {
        this.seen = counter;
    }
    
}
