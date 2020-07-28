import java.util.Set;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        // You can test your method here

        Set<String> mySet = new HashSet<>();
        mySet.add("first");
        mySet.add("second");
        mySet.add("third");
        mySet.add("first");
        mySet.add("first");
        System.out.println(returnSize(mySet));
    }

    // implement the method returnSize here, which returns
    // the number of elements in the set that it receives as a parameter.
    
    public static int returnSize(Set object) {
        return object.size();
    }

}
