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
import java.util.ArrayList;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        for (LicensePlate plate : this.registry.keySet()) {
            if (plate.equals(licensePlate)) {
                return false;
            }
        }

        this.registry.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        for (LicensePlate plate : this.registry.keySet()) {
            if (plate.equals(licensePlate)) {
                return this.registry.get(plate);
            }
        }

        return null;
    }

    public boolean remove(LicensePlate licensePlate) {
        for (LicensePlate plate : this.registry.keySet()) {
            if (plate.equals(licensePlate)) {
                this.registry.remove(plate, this.registry.get(plate));
                return true;
            }
        }

        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate plate : this.registry.keySet()) {
            System.out.println(plate.toString());
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        
        for (String owner : this.registry.values()) {
            if (owners.contains(owner)) {
                continue;
            }
            
            System.out.println(owner);
            owners.add(owner);
        }
    }
}
