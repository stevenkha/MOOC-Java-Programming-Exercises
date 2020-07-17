
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<archiveItems> list = new ArrayList<>();
        
        while (true) {
            System.out.println("Identifier? (Empty will stop)");
            String id = String.valueOf(scanner.nextLine());
            if (id.isEmpty()) {
                break;
            }
            System.out.println("Name? (Empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            archiveItems items = new archiveItems(id, name);
            
            if (list.contains(items)) {
                continue;
            } else {
                list.add(items);
            }
           
            
        }//while

        for (archiveItems items : list) {
            
            System.out.println(items.getId() + ": " + items.getName());
            
        }
    }
}
