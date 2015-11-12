
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String user_input = reader.nextLine();
        int num_of_char = calculateCharacters(user_input);
        System.out.println("Number of characters: " + num_of_char);
        // call your method from here
    }
    
    // do here the method
    public static int calculateCharacters(String text) {
        int textLength = text.length();
        return textLength;
    
}
    
}
