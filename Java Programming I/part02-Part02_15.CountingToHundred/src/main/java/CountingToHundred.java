
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int input = Integer.valueOf(scanner.nextLine());
        System.out.println(input);
        while (input < 100) {
            input++;
            System.out.println(input);        
        }
    }
}
