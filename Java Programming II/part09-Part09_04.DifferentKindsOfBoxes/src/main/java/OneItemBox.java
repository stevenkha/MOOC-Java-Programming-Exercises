/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class OneItemBox extends Box {
    
    private Item theItem;
    
    public OneItemBox() {
        
    }

    @Override
    public void add(Item item) {
        
        if (this.theItem != null) {
            return;
        }
        
        this.theItem = item;
    }

    @Override
    public boolean isInBox(Item item) {
        return this.theItem != null && this.theItem.equals(item);
    }
    
}
