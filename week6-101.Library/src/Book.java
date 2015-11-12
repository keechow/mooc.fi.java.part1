/*
EXERCISE 101.1: BOOK
Let us start with the class Book. 
The class has instance variables 
title for the book title, 
publisher for the name of the publisher, and 
year for the publishing year. 
The title and the publisher are of the type String and the 
publishing year is represented as an integer.

Now implement the class Book. 
The class should have the constructor 
public Book(String title, String publisher, int year) and 
methods public String title(), 
public String publisher(), 
public int year() 
and 
public String toString().
 */
public class Book {
    private String title;           //book title
    private String publisher;       //name of the publisher
    private int year;               //publishing year
    
    public Book (String booktitle, String bookPublisher, int publishingYear) {
        this.title = booktitle;
        this.publisher = bookPublisher;
        this.year = publishingYear;
    }
    
    public String title() {
        return this.title;
    }
    
    public String publisher() {
        return this.publisher;
    }
    
    public int year() {
        return this.year;
    }
    
    public String toString() {
        String year = "" + this.year;   //convert this.year from int to String
        String returnString = this.title + ", " + this.publisher + ", " + year;
        return returnString;
                
        
    }
    
}
