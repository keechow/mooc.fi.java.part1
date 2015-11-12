
import java.util.ArrayList;
    
public class Team {
    private String name;
    private ArrayList<Player> teamMembers;
    private int teamSizeLimit;
    
    
    
    public Team (String name) {
        this.name = name;
        this.teamMembers = new ArrayList<Player>();
        this.teamSizeLimit = 16;
    }
         
    public String getName() {
        return this.name;
    }
    
    public void addPlayer (Player add_this_player){
        if (teamMembers.size() < teamSizeLimit) {
            this.teamMembers.add(add_this_player);
        }
    }
    
    public void printPlayers () {
        for (Player each : teamMembers) {
             System.out.println(each.toString());
        }
    }
    
    public void setMaxSize(int size) {
        this.teamSizeLimit = size;
    }
    
    public int size() {
        return this.teamMembers.size();
    }
    
    public int goals() {
        int goalScored = 0;
        for (Player each : this.teamMembers) {
            int player_goal = each.goals();
            goalScored += player_goal;
        }
        return goalScored;
    }

    
}


/*
Add to the class Team the following methods:

addPlayer, adds a player to the team
printPlayers, prints the players in the team
You should store the players to an instance variable of the 
type ArrayList<Player> within the class Team.
*/