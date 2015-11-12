import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
             
        while(true) {
            System.out.println("Type a word: ");
            String user_input = reader.nextLine();
            if (user_input.length() > 0) {
                words.add(user_input);
            }
            
            else {
                break;
            }
        }
        
        System.out.println("You typed the following words: ");
        
        for (String each : words) {
            System.out.println(each);
        }
    }
}
