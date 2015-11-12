import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        int odd_num = 0;
        int even_num = 0;
        while (true) {
            System.out.println("Type numbers:");
            int user_input = Integer.parseInt(reader.nextLine());
            if (user_input == -1) {
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + sum);
                System.out.println("How many numbers: " + counter);
                double average = (double)sum / counter;
                System.out.println("Average: " + average);
                System.out.println("Even numbers: "+ even_num);
                System.out.println("Odd numbers: " + odd_num);
                
                break;
            }
            else {
                sum += user_input; 
                counter += 1;
                if (user_input % 2 == 0) {
                    even_num += 1;
                }
                else {
                    odd_num += 1;
                }
            }
            
          
        

        }
        
        
    }
}
