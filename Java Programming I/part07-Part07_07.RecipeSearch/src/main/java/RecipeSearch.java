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

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        UserInterface ui = new UserInterface(scan);
        ui.start();
    }
}
