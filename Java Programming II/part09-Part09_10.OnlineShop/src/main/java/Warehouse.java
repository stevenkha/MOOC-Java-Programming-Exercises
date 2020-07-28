/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class Warehouse {
    
    private Map<String, Integer> productsPrice;
    private Map<String, Integer> productsStock;
    
    public Warehouse() {
        this.productsPrice = new HashMap<>();
        this.productsStock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.productsPrice.put(product, price);
        this.productsStock.put(product, stock);
    }
    
    public int price(String product) {
        for (String key : this.productsPrice.keySet()) {
            if (key.equals(product)) {
                return this.productsPrice.get(key);
            }
        }
        
        return -99;
    }
    
    public int stock(String product) {
        for (String key : this.productsStock.keySet()) {
            if (key.equals(product)) {
                return this.productsStock.get(key);
            }
        }
        
        return 0;
    }
    
    public boolean take(String product) {
        int stockAmount = this.productsStock.getOrDefault(product, 0);
        if (stockAmount > 0) {
            stockAmount--;
            underZero(product);
            this.productsStock.put(product, stockAmount);
            return true;
        }
        
        return false;
    }

    public void underZero(String product) {
        int stockAmount = this.productsStock.get(product);
        if (stockAmount < 0) {
            stockAmount = 0;
        }
    }
    
    public Set<String> products() {
        Set<String> products = new HashSet<>();
        for (String product : this.productsStock.keySet()) {
            products.add(product);
        }
        
        return products;
    }
}
