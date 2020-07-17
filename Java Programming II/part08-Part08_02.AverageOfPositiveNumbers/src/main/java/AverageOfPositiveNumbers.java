import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int input = scanner.nextInt();
            
            if (input == 0) {
                average(numbers);
                break;
            }
            
            if (input > 0) {
                numbers.add(input);
            }
        }
    }
    
    public static void average(ArrayList<Integer> numbers) {
        int total = 0;
        if (numbers.isEmpty()) {
            System.out.println("Cannot calculate the average");
            return;
        }
        for (int num : numbers) {
            total += num;
        }
        
        double average = 1.0 * total / numbers.size();
        
        System.out.println(average);
    }
}
