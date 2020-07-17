
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int longestLength = 0;
        int count = 0;
        int sum = 0;
        String name = "";
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] parts = input.split(",");
            sum += Integer.valueOf(parts[1]);
            count++;
            
            int length = input.length();
            
            if (length > longestLength) {
                longestLength = length;
                name = String.valueOf(parts[0]);
            }
           
        }//while

        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (1.0 * sum / count));
    }
}
