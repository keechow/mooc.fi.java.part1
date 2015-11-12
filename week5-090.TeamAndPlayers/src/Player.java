/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Smart
 */
public class Player {
    private String playerName;
    private int goalScored;
    
    public Player (String name, int goal) {
        this.playerName = name;
        this.goalScored = goal;
    }
    
    public Player (String name) {
        this(name, 0);
    }
    public String getName() {
        return this.playerName;
    }
    
    public int goals() {
        return this.goalScored;
    }
    
    public String toString() {
        String goal_scored = "" + this.goalScored;
            //this is to convert goalsScored from int to String
        String return_string = "Player: " + this.playerName + ", goals " + goal_scored;
        
        return return_string;
    }
    
}
