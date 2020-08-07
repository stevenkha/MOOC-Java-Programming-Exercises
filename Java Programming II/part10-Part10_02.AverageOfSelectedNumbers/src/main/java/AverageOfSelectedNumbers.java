import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList();
        System.out.println("Input numbers, type \"end\" to stop");
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                break;
            }
            
            list.add(Integer.valueOf(input));
        }
        
        System.out.println("Print the average of the negative numbers or positive numbers? (n/p)");
        String selection = scanner.nextLine();
        
        if (selection.equals("n")) {
            System.out.println("Average of the negative numbers: " + list.stream().mapToInt(s -> s).filter(number -> number < 0).average().getAsDouble());
        } else {
            System.out.println("Average of the positive numbers: " + list.stream().mapToInt(s -> s).filter(number -> number > 0).average().getAsDouble());
        }
        

    }
}
