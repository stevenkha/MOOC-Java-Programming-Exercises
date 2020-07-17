
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            
            int number = Integer.valueOf(input);
            cube(number);
        }

    }

    public static void cube(int number) {
        int newNumber = number * number * number;
        System.out.println(newNumber);
    }
}
