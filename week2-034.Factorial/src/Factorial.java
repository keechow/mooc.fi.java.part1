import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int user_input = Integer.parseInt(reader.nextLine());
        
        int counter = 1;
        int sum = 1;
        while (counter <= user_input) {
            sum *= counter;
            counter += 1;
        }
        System.out.println("Factorial is " + sum);
        
    }
}
