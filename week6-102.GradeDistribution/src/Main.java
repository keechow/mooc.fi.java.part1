import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
            
        ArrayList<Integer> user_score = new ArrayList<Integer>();
        
        while(true) {
             System.out.println("Type exam scores, -1 completes:");
             int user_input = Integer.parseInt(reader.nextLine());
             if(!(user_input == -1)) {
                 if (user_input >= 0 && user_input <= 60){
                 user_score.add(user_input);
                 }
             }
             else {
                 break;
             }
        }
        
        Grade myGrade = new Grade(user_score);
        int[] myGradeTable = myGrade.getGradeTable();
        double myGradeAccpt = myGrade.getAcceptancePercentage();
        PrintResult printMyGrade = new PrintResult(myGradeTable, myGradeAccpt);
        printMyGrade.printResult();
        
        
        


    }
}
