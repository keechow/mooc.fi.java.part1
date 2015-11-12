/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Smart
 */
//import java.util.ArrayList;
import java.util.Arrays;

public class PrintResult {
    private int[] gradeTable;
    private double acceptancePercentage;
    
    public PrintResult(int[] gradeTable, double accptPer) {
        this.gradeTable = gradeTable;
        this.acceptancePercentage = accptPer;
        
    }
    
    //method to create * for each grade in Grade Table
    public String createStar(int num) {
        String return_string = "";
        for(int i=0; i < num; i++) {
            return_string += "*";
        }
        return return_string;
    }
    
//printing out result
    public void printResult() {

        String five = "5: " + this.createStar(this.gradeTable[5]);
        String four = "4: " + this.createStar(this.gradeTable[4]);
        String three = "3: " + this.createStar(this.gradeTable[3]);
        String two = "2: " + this.createStar(this.gradeTable[2]);
        String one = "1: " + this.createStar(this.gradeTable[1]);
        String zero = "0: " + this.createStar(this.gradeTable[0]);
        
        String accptPer = "" + this.acceptancePercentage;
        String accp = "Acceptance percentage: " + accptPer;
        
        System.out.println("Grade distribution: ");
        System.out.println(five);
        System.out.println(four);
        System.out.println(three);
        System.out.println(two);
        System.out.println(one);
        System.out.println(zero);
        System.out.println(accp);
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    

}
