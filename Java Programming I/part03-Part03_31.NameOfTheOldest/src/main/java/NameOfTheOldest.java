
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String oldestName = "a";
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] parts = input.split(",");
            int num = Integer.valueOf(parts[1]);
            
            if (num > oldest) {
                oldest = num;
                oldestName = String.valueOf(parts[0]);
            }
             
        }//while
        
        System.out.println("Name of the oldst: " + oldestName);
    }
}
