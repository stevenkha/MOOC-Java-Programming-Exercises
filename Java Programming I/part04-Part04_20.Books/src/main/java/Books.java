/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class Books {
    private String book;
    private int pages;
    private int year;
    
    public Books(String bookName, int totalPages, int publishYear) {
        this.book = bookName;
        this.pages = totalPages;
        this.year = publishYear;
    }
    
    public String getBookName() {
        return this.book;
    }
    
    public String toString() {
        return this.book + ", " + this.pages + " pages, " + this.year;
    }
}
