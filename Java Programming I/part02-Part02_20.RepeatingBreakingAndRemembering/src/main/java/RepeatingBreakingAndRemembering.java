
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give numbers:");
        int totalNumbers = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;
        int sum = 0;
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                break;
            }
            
            if (input % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }
            
            totalNumbers++;
            sum += input;
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + totalNumbers);
        System.out.println("Average: " + (double) sum / totalNumbers);
        System.out.println("Even: " + evenNumbers);
        System.out.println("Odd: " + oddNumbers);
    }
}
