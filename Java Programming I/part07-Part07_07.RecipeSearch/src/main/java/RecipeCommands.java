/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
import java.util.Scanner;
import java.util.ArrayList;

public class RecipeCommands {

    private Scanner scanner;
    private FindRecipes recipes;

    public RecipeCommands(Scanner scanner) {
        this.scanner = scanner;
        this.recipes = new FindRecipes(scanner);
    }

    public void command(String command) {
        switch (command) {
            case "list":
                list();
                break;
            case "find name":
                name();
                break;
            case "find cooking time":
                time();
                break;
            case "find ingredient":
                ingredient();
                break;
        }
    }

    public void list() {
        System.out.println("Recipes: ");
        this.recipes.listAllRecipes();
        System.out.println("");
    }

    public void name() {
        System.out.print("Searched word: ");
        String word = String.valueOf(scanner.nextLine());
        for (Recipe e : this.recipes.returnRecipes()) {
            if (e.getName().contains(word)) {
                System.out.println("");
                System.out.println("Recipes");
                this.recipes.listARecipe(e);
                System.out.println("");
            }
        }
    }

    public void time() {
        System.out.print("Max cooking time: ");
        int time = Integer.valueOf(scanner.nextLine());
        System.out.println("");
        System.out.println("Recipies: ");
        for (Recipe e : this.recipes.returnRecipes()) {
            if (e.getTime() <= time) {
                this.recipes.listARecipe(e);
            }
        }
        System.out.println("");
    }

    public void ingredient() {
        
        System.out.print("Ingredient: ");
        String findIngredient = scanner.nextLine();
        for (Recipe e : this.recipes.returnRecipes()) {
            for (String str : e.getIngr()) {
                if (str.equals(findIngredient)) {
                    this.recipes.listARecipe(e);
                }
            }
        }
        
        System.out.println("");
    }

    public void start(String fileName) {
        this.recipes.addRecipes(fileName);
    }

}
