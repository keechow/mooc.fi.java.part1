import java.util.Scanner;
import java.util.ArrayList;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner reader = new Scanner(System.in);
          
        Database myBirdDatabase = new Database();
        
        while(true) {
            System.out.println("?");
            String userInput = reader.nextLine();
            
            if(userInput.equals("Quit")) {
                break;
            }
            else if (userInput.equals("Add")){
                System.out.println("Name: ");
                String name = reader.nextLine();
                System.out.println("Latin Name: ");
                String latinName = reader.nextLine();
                
                myBirdDatabase.addBird(name, latinName);
            
            }
            
            else if (userInput.equals("Observation")) {
                System.out.println("What was observed:? ");
                String input = reader.nextLine();
                
                myBirdDatabase.observation(input);
            }
            
            else if (userInput.equals("Statistics")) {
                System.out.println(myBirdDatabase.toString());
            }
            
            else if (userInput.equals("Show")) {
                System.out.println("What? ");
                String input = reader.nextLine();
                System.out.println(myBirdDatabase.returnOne(input));
            }
            
            else {
                continue;
            }
        }
    }
}
 