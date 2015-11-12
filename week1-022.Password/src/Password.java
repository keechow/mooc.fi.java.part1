
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
      
        while (true) {
            System.out.println("Type the password: ");
            String userInput = reader.nextLine();
        
            if (userInput.equals(password)) {
                System.out.println("Right!");
                System.out.println("The secret is: jryy qbar!");
                break;
            }
            else {
                System.out.println("Wrong!");
            }
        // Write your code here
        }
    }
}
    

/*
In this exercise we create a program that asks the user for a password. If the password is right, a secret message is shown to the user.

Type the password: turnip
Wrong!
Type the password: beetroot
Wrong!
Type the password: carrot
Right!

The secret is: jryy qbar!
        
*/