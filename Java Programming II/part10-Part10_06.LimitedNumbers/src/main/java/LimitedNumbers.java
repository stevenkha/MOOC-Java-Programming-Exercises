
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while (true) {
            int number = scanner.nextInt();
            
            if (number < 0) {
                break;
            }
            
            numbers.add(number);
        }
        
        numbers.stream().filter(i -> i > 0).filter(i -> i < 6).forEach(number -> System.out.println(number));
    }
}
