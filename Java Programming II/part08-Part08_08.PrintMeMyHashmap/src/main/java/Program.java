
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }

    public static void printKeys(HashMap<String,String> hashMap) {
        //print all the keys in the hashMap given as a parameter
        for (String key : hashMap.keySet()) {
            System.out.println(key);
        }
        
    }
    
    public static void printKeysWhere(HashMap<String,String> hashMap, String text) {
        //prints the keys in the hashmap given as a parameter which contain the string given as a parameter
        for (String keys : hashMap.keySet()) {
            if (keys.contains(text)) {
                System.out.println(keys);
            }
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String,String> hashMap, String text) {
        //prints the values in the given hashmap which keys contain the given string
        for (String keys : hashMap.keySet()) {
            if (keys.contains(text)) {
                System.out.println(hashMap.get(keys));
            }
        }
    }
}
