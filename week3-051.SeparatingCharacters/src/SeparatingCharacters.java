
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Tyoe your name: ");
        String user_input = reader.nextLine();
        int user_input_length = user_input.length();
        int counter = 0;
        
        while(counter < user_input_length) {
            char char_now = user_input.charAt(counter);
            counter += 1;
            System.out.println(counter + ". character: " + char_now);
        }
        
    }
}
