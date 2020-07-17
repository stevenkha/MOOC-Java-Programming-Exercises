/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class FindRecipes {
    
    private ArrayList<String> aRecipe;
    private ArrayList<Recipe> allRecipes;
    private ArrayList<ArrayList<String>> ingrList;
    private Recipe recipe;
    private Scanner scanner;
    
    public FindRecipes(Scanner scanner) {
        this.scanner = scanner;
        this.aRecipe = new ArrayList<>();
        this.allRecipes = new ArrayList<>();
        this.ingrList = new ArrayList<>();
        this.recipe = new Recipe(" ", " ", null);
    }
    
    public void addRecipes(String fileName) {
        int index = 0;
        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            while (scanner.hasNextLine()) {
                String row = String.valueOf(scanner.nextLine());
                
                if (row.isEmpty() || !scanner.hasNextLine()) {
                    ArrayList<String> inge = new ArrayList<>();
                    for (int i = 2; i < this.aRecipe.size(); i++) {
                        inge.add(this.aRecipe.get(i));
                    }
                    ArrayList<String> test = new ArrayList<>();
                    this.ingrList.add(inge);
                    test = this.ingrList.get(0);
                    this.recipe = new Recipe(this.aRecipe.get(0), this.aRecipe.get(1), test);
                    this.allRecipes.add(this.recipe);
                    this.ingrList.clear();
                    this.aRecipe.clear();

                    continue;
                }
                this.aRecipe.add(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void listAllRecipes() {
        for (Recipe e : this.allRecipes) {
            System.out.println(e.getName() + ", cooking time: " + e.getTime());
        }
    }

    public void listARecipe(Recipe e) {
        System.out.println(e.getName() + ", cooking time: " + e.getTime());
    }
    
    public ArrayList<Recipe> returnRecipes() {
        return this.allRecipes;
    }
    
    public ArrayList<String> returnIngr() {
        return this.recipe.getIngr();
    }
    
}
