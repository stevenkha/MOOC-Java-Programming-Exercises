
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to? ");
        int finalNumber = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from? ");
        int beginNumber = Integer.valueOf(scanner.nextLine());
        
        for (int i = beginNumber; i <= finalNumber; i++) {
            System.out.println(i);
        }
    }
}
