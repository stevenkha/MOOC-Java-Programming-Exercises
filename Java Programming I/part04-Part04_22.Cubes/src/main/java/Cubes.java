
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stringToNumber = 0;
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                break;
            }
            
            stringToNumber = Integer.valueOf(input);
            System.out.println(stringToNumber * stringToNumber * stringToNumber);
        }
        
        
    }
}
