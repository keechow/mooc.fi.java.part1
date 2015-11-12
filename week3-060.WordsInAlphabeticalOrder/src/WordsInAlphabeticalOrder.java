
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> myList = new ArrayList<String>();
        
        while(true) {
            System.out.println("Type a word: ");
            String user_input = reader.nextLine();
            if(user_input.isEmpty()) {
                break;
            }
            else {
                myList.add(user_input);
            }                  
        }
        
        Collections.sort(myList);
        
        for (String each : myList) {
            System.out.println(each);
        }
        
        
    }
}


