
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean notEmpty = true;
        
        while (notEmpty) {
            String sentence = String.valueOf(scanner.nextLine()); 
            String[] pieces = sentence.split(" ");
            
            for (int i = 0; i < pieces.length; i++) {
                System.out.println(pieces[i]);
            }
            
            if (sentence.isEmpty()) {
                notEmpty = false;
            }
        }
        
    }
}
