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
public class Recipe {
    
    private String name;
    private String time;
    private ArrayList<String> ingr;
    
    public Recipe(String name, String time, ArrayList<String> ingr) {
        this.name = name;
        this.time = time;
        this.ingr = ingr;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getTime() {
        int recipeTime = Integer.valueOf(this.time);
        return recipeTime;
    }

    public ArrayList<String> getIngr() {
        return this.ingr;
    }
}
