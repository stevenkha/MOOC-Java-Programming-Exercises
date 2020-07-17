
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstCurrentAmount = 0;
        int secondCurrentAmount = 0;
        
        while (true) {
            System.out.print("> ");

            System.out.println("First: " + firstCurrentAmount + "/100");
            System.out.println("Second: " + secondCurrentAmount + "/100");
            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            int totalAmount = firstCurrentAmount + amount;
            
            if (amount > 0 && command.equals("add") && totalAmount <= 100) {
                firstCurrentAmount = totalAmount;
            } 
            
            if (totalAmount > 100) {
                firstCurrentAmount = 100;
            }
            
            if (command.equals("move") && firstCurrentAmount == 0) {
                secondCurrentAmount = 0;
            } else if (command.equals("move")) {
                if (amount > firstCurrentAmount) {
                    secondCurrentAmount = firstCurrentAmount;
                } else {
                    secondCurrentAmount += amount;
                }
                firstCurrentAmount -= amount;
                
                if (firstCurrentAmount < 0) {
                    firstCurrentAmount = 0;
                }
            }
            
            if (secondCurrentAmount > 100) {
                secondCurrentAmount = 100;
            }

            if (command.equals("remove") && secondCurrentAmount == 0) {
                secondCurrentAmount = 0;
            } else if (command.equals("remove")) {
                secondCurrentAmount -= amount;
                if (secondCurrentAmount < 0) {
                    secondCurrentAmount = 0;
                }
            }
        }//while
    }

}
