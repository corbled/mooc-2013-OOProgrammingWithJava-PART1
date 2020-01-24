import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


//        NHLStatistics.sortByPoints();     // orders the players by points
//        NHLStatistics.sortByGoals();      // orders the players by goals
//        NHLStatistics.sortByAssists();    // orders the players by assists
//        NHLStatistics.sortByPenalties();  // orders the players by penalty minutes

//        NHLStatistics.top(10);

//      NHLStatistics.teamStatistics("NYR");

        System.out.println("Top ten by goals.");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println();

        System.out.println("Top twenty five by penalties.");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println();

        System.out.println("Sidney Crosbys statistics.");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.println();

        System.out.println("Statistics for the Philadelphia Flyers.");
        NHLStatistics.teamStatistics("PHI");
        System.out.println();

        System.out.println("Statistics for the Anaheim Ducks ordered by points.");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        System.out.println();

    }
}
