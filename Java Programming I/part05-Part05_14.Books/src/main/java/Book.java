
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object compare) {
        if (this == compare) {
            return true;
        }
        
        if (!(compare instanceof Book)) {
            return false;
        }
        
        Book newBook = (Book) compare;
        
        return this.name.equals(newBook.name) && this.publicationYear == newBook.publicationYear;
        
    }

}
