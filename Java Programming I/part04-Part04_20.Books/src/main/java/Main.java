import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        ArrayList<Books> book = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Title: ");
            String bookTitle = scanner.nextLine();
            if (bookTitle.isEmpty()) {
                break;
            }
            
            System.out.print("Pages: ");
            int bookPages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int publishYear = Integer.valueOf(scanner.nextLine());
            
            book.add(new Books(bookTitle, bookPages, publishYear));
        }
        
        System.out.print("What will be printed? ");
        String input = scanner.nextLine();
        
        if (input.equals("everything")) {
            for (Books books : book) {
                System.out.println(books);
            }
        } else {
            for (Books books : book) {
                if (input.equals("name")) {
                    System.out.println(books.getBookName());
                }
            }
        } 
        
       
    }
    
    
}
