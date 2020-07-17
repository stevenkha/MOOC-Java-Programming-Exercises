/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class archiveItems {
    private String name;
    private String id;
    
    public archiveItems(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getId() {
        return this.id;
    }
    
    public boolean equals(Object compare) {
        if (this == compare) {
            return true;
        }
        
        if (!(compare instanceof archiveItems)) {
            return false;
        }
        
        archiveItems newItem = (archiveItems) compare;
        
        return this.id.equals(newItem.id);
    }
    
}
