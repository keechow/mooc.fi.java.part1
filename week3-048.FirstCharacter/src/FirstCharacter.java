import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String user_input = reader.nextLine();
        char firstChar = firstCharacter(user_input);
        System.out.println("First character: " + firstChar);
                
    }
    
    public static char firstCharacter(String text) {
        char first = text.charAt(0);
        return first;
    }
}
