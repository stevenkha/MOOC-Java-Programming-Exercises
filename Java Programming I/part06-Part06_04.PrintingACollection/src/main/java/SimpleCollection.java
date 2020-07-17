
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        String output = "The collection " + this.name + " has " + this.elements.size();
        
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        } 
        
        String printedSet = "";
        for (String value : this.elements) {
            printedSet = printedSet + "\n" + value;
        }
        
        if (this.elements.size() == 1) {
            return output + " element:" + printedSet;
        }
        
        return output + " elements:" + printedSet;
    }
    
}
