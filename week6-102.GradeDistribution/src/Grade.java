/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Smart
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Grade {
    //private ArrayList<Integer>gradeTable; // Grade Table
    private int[] gradeTable;    
    private double acceptance;
    private int numOfEntry;
    private int numOfAcceptance;
    
    public Grade(ArrayList<Integer> user_score) {
        //this.gradeTable = new ArrayList<Integer>();
        this.gradeTable = new int[6];
        this.numOfEntry = user_score.size();
        this.numOfAcceptance = 0;
                
        for (int each : user_score) {
            int userGrade = this.grading(each);
            this.updateGradeTable(userGrade);
        }
    }
// return grade based on score entered
    public int grading (int score) {
 
        if (score <= 60 && score >= 50) {
            this.numOfAcceptance += 1;
            return 5;
        }
        else if (score <= 49 && score >= 45) {
            this.numOfAcceptance += 1;
            return 4;
        }
        else if (score <= 44 && score >= 40) {
            this.numOfAcceptance += 1;
            return 3;
        }
        else if (score <= 39 && score >= 35) {
            this.numOfAcceptance += 1;
            return 2;
        }
        else if (score <= 34 && score >= 30) {
            this.numOfAcceptance += 1;
            return 1;
        }
        else {
            return 0;
        }
    }
    
//update the value of Grade Table based on grade given    
    public void updateGradeTable (int grade) {
        this.gradeTable[grade] += 1;
        //int update = this.gradeTable[grade]) + 1;
        //this.gradeTable.set(grade, update);
        }

 //method to calculate Acceptance Percentage
    public double getAcceptancePercentage() {
        double sum = (double)this.numOfAcceptance / this.numOfEntry;
        return sum * 100;
    }
    
    public int[] getGradeTable() {
        return this.gradeTable;
    }
    
}
