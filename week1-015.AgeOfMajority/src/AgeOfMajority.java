
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("How old are you?");
        
        int age = Integer.parseInt(reader.nextLine());
        
        if (age >= 18) {
            System.out.println("You have reached the age of majority!");
        }
        
        else {
            System.out.println("You have not reached the age of majority yet!");
        }

        // Type your program here 
    }
}

/*
How old are you? 12

You have not reached the age of majority yet!
        
How old are you? 32

You have reached the age of majority!
        
*/
