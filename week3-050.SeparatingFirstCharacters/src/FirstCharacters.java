import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String user_input = reader.nextLine();
        int counter = 0;
        int user_input_length = user_input.length();
        
        if (user_input_length < 3) {
            System.out.println("");
        }
        else {
            while (counter < 3) {
            char current_char = user_input.charAt(counter);
            counter += 1;
            System.out.println(counter + ". character: " + current_char);
            }
        }    
    }
}
