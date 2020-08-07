
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        System.out.println("Input numbers, type \"end\" to stop.");
        List<Integer> list = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }
            
            list.add(Integer.valueOf(input));
        }
        
        double averageOfNumbers = list.stream().mapToInt(s -> s).average().getAsDouble();
        System.out.println("average of numbers: " + averageOfNumbers);
    }
}
