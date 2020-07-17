
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Containers container = new Containers();

        while (true) {
            container.print();

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if (amount < 0) {
                amount = 0;
            }

            if (command.equals("add")) {
                container.add(amount);
            } else if (command.equals("move")) {
                container.move(amount);
            } else if (command.equals("remove")) {
                container.remove(amount);
            }

        }
    }

}
