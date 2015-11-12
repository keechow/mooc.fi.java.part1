import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type in your name: ");
        String user_input = reader.nextLine();
        
        int string_length = user_input.length();
        int counter = string_length - 1;
        
        while (counter >= 0) {
            char current_char = user_input.charAt(counter);
            System.out.print(current_char);
            counter -= 1;            
        }
    }
}
