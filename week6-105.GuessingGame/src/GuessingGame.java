import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        // use only this scanner, othervise the tests do not work
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);
        int low = lowerLimit;
        int high = upperLimit;
        int avg = this.average(low, high);

        while (!(low == high)) {
            if(isGreaterThan(avg)) {
                low = avg + 1;
            }
            else {
                high = avg;
            }
            avg = this.average(low, high);
        }
        String ans = "" + low;
        System.out.println("The number you're thinking of is " + ans + ".");
        
        // write the guessing logic here
    }

    // implement here the methods isGreaterThan and average

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
    
    public boolean isGreaterThan(int value) {
        while(true) {
            String value1 = "" + value;
            System.out.println("Is your number greater than " + value1 + "? (y/n)");
            String userInput = reader.nextLine();
        
            if (userInput.equals("y")) {
                return true;
            }
            else if (userInput.equals("n")) {
                return false;
            }
            else {
                 continue;
            }
        }
    }
    
    public int average(int num1, int num2) {
        //calculate the average of the given values
        int total = num1 + num2;
        return total / 2;
    }
}
