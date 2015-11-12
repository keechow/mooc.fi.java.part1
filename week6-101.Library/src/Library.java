/*
EXERCISE 101.4: IMPROVED SEARCH
There are some minor problems with the implemented search functionality. 
One particular problem is that the search differentiates upper and lower case letters. 
In the above example the search by title with the search term "cheese" produced an empty list as answer. 
The example where the search term contained extra white spaces did not give the expected answer, either. 
We'd like the search functionality to be case insensitive and not disturbed by the extra white spaces 
at the start or at the end of the search terms. We will implement a small helper library StringUtils that will 
then be used in the Library for the more flexible search functionality.

Implement the class StringUtils with a 
static method public static boolean included(String word, String searched), 
which checks if the string searched is contained within the string word. 
As described in the previous paragraph, the method should be case insensitive and 
should not care about trailing and ending white spaces in the string searched. 
If either of the strings is null, the method should return false.

Tip: The methods trim and toUpperCase() of the class String might be helpful.

When you have completed the method, use it in the search functionality of the class Library.

Use the method as follows:
 */
import java.util.ArrayList;
import java.lang.String;

public class Library {
    private ArrayList<Book> libraryBook;    
    
    public Library() {
        this.libraryBook = new ArrayList<Book>();
    }
    
    public void addBook (Book newBook) {
        this.libraryBook.add(newBook);
    }
    
    public void printBooks() {
        for (Book each : this.libraryBook) {
            System.out.println(each);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> booksFound = new ArrayList<Book>();
        for (Book each : this.libraryBook) {
            if(StringUtils.included(each.title(), title)) {
                booksFound.add(each);
            }
        }
        return booksFound;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book>booksFound = new ArrayList<Book>();
        for (Book each : this.libraryBook) {
            if (StringUtils.included(each.publisher(), publisher)) {
                booksFound.add(each);
            }
        }
        return booksFound;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> booksFound = new ArrayList<Book>();
        for(Book each : this.libraryBook) {
            int yearPublished = each.year();
            if (year == yearPublished) {
                booksFound.add(each);
            }
        }
        return booksFound;
    }
    
    
    
    
}
