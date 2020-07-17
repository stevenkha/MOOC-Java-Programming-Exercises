
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container = new Container();

        while (true) {
            System.out.print("> ");
            System.out.println("First: " + container.contains() + "/100");
            System.out.println("Second: " + container.secondContains() + "/100");
            
            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add")) {
                container.add(amount);
            }
            
            if (command.equals("remove")) {
                container.remove(amount);
            }
            
            if (command.equals("move")) {
                container.move(amount);
            }

        }
        
    }

}
