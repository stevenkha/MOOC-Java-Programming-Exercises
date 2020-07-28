/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.changeHistory = new ChangeHistory();
        super.addToWarehouse(initialBalance);
        this.changeHistory.add(initialBalance);
    }

    public String history() {
        return this.changeHistory.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.changeHistory.add(super.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double taken = super.takeFromWarehouse(amount);
        this.changeHistory.add(super.getBalance());
        return taken;
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName() + "\n History: " + this.changeHistory.toString() + 
                           "\n Largest amount of product: " + this.changeHistory.maxValue() + "\n Smallest amount of product: " + this.changeHistory.minValue() +
                           "\n Average: " + this.changeHistory.average());
    }
}
