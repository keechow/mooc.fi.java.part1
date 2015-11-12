import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        Random random = new Random();
        this.numbers = new ArrayList<Integer>();
        //The numbers of the week consist of 7 different numbers between 1 and 39
        int lottery_length = 7;
        int counter = 0;
        while (counter < lottery_length) {
            int numDrawn = 1 + random.nextInt(39);
            if (!containsNumber(numDrawn)) {
                this.numbers.add(numDrawn);
                counter += 1;
            } 
        }
        // Write the number drawing here using the method containsNumber()
        
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        return (this.numbers.contains(number));      
    }
}
