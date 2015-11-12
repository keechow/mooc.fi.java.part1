import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("4444444444455555");
        LotteryNumbers lotteryNumbers = new LotteryNumbers();
        ArrayList<Integer> numbers = lotteryNumbers.numbers();
        
        System.out.println("HAHAHAHAHA");

        System.out.println("Lottery numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }
}
