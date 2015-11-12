
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int numberGuess = 0;

        // program your solution here. Do not touch the above lines!
        while(true) {
            System.out.println("Guess a number: ");
            int user_guess = Integer.parseInt(reader.nextLine());
            
            if (user_guess == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        
            else if (user_guess < numberDrawn) {
                numberGuess += 1;
                System.out.println("The number is greater, guesses made: " + numberGuess);                
            }
        
            else {
                numberGuess += 1;
                System.out.println("The number is lesser");
                System.out.println("The number is lesser, guesses made: " + numberGuess);
            }
        }
    }    

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
