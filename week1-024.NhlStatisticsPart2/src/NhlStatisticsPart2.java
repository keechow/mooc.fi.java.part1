
import java.util.Scanner;
import nhlstats.NHLStatistics;

public class NhlStatisticsPart2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("NHL statistics service");

        while (true) {
            System.out.println("");
            System.out.print("command (points, goals, assists, penalties, player, club, quit): ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                break;
            }

            if (command.equals("points")) {
                // Print the top ten players sorted by points.
                NHLStatistics.sortByPoints();
                NHLStatistics.top(10);
            } else if (command.equals("goals")) {
                // Print the top ten players sorted by goals.
                NHLStatistics.sortByGoals();
                NHLStatistics.top(10);
            } else if (command.equals("assists")) {
                //  Print the top ten players sorted by assists.
                NHLStatistics.sortByAssists();
                NHLStatistics.top(10);
            } else if (command.equals("penalties")) {
                //  Print the top ten players sorted by penalties.
                NHLStatistics.sortByPenalties();
                NHLStatistics.top(10);
            } else if (command.equals("player")) {
                // Ask the user first which player's statistics are needed and then print them.
                System.out.println("Please enter player's name: ");
                String player_name = reader.nextLine();
                NHLStatistics.searchByPlayer(player_name);
            } else if (command.equals("club")) {
                // Ask the user first which club's statistics are needed and then print them.
                // Note: When printing statistics they should be ordered by points (so the players with the most points come first).
                System.out.println("Please enter club's name: ");
                String club_name = reader.nextLine();
                NHLStatistics.sortByPoints();
                NHLStatistics.teamStatistics(club_name);
            }

        }
    }
}

/*
NHLStatistics.sortByPoints();     // orders the players by points
NHLStatistics.sortByGoals();      // orders the players by goals
NHLStatistics.sortByAssists();    // orders the players by assists
NHLStatistics.sortByPenalties();  // orders the players by penalty minutes        

NHLStatistics.searchByPlayer("Jaromir Jagr");  // prints stats of Jaromir Jagr
NHLStatistics.searchByPlayer("Koivu");         // prints stats of Mikko Koivu and Saku Koivu
NHLStatistics.searchByPlayer("Teemu");         // prints stats of all players named Teemu
        
NHLStatistics.teamStatistics("NYR");  // Statistics of New York Rangers
*/