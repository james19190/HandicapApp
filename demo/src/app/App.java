package src.app;
import java.util.*;
import src.players.Player;

public class App{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        //get user information
        System.out.print("Enter the course you are playing: ");
        String course = sc.nextLine();

        System.out.print("Enter the slope rating of the course: ");
        double slopeRating = sc.nextInt();

        System.out.print("Enter the course rating of the course: ");
        double courseRating = sc.nextDouble();

        System.out.print("Enter the par of the course: ");
        int par = sc.nextInt();

        System.out.println("The course is: " + course + " || Par: " + par + " with a slope rating of " + slopeRating + " and a course rating of " + courseRating + "\n");

        System.out.print("Enter the # of Players: ");
        int numPlayers = sc.nextInt();
        System.out.println("The number of players is: " + numPlayers + "\n");

        List<Player> players = new ArrayList<>();

        String currName;
        int currHandi;
        Player currPlayer;

        for (int i = 0; i < numPlayers; i++){
            System.out.print("Enter the name of player " + (i+1) + ": ");
            currName = sc.next();
            System.out.print("Enter the GHIN Handicap of player " + (i+1) + ": ");
            currHandi = sc.nextInt();
            currPlayer = new Player(currName, currHandi);
            players.add(currPlayer);

        }

        System.out.println("\nThe players are: ");
        for (int i = 0; i < players.size(); i++){
            players.get(i).printPlayer();
        }

        System.out.println("\nThe course handicap for each player is: ");
        for (int i = 0; i < players.size(); i++){
            currPlayer = players.get(i);
            System.out.println("The course handicap for " + currPlayer.getName() + " is: " + calculateCourseHandicap(currPlayer, slopeRating, courseRating, par));
        }


        System.out.println("The Playing Handicap for each player is: ");
        for (int i = 0; i < players.size(); i++){
            currPlayer = players.get(i);
            System.out.println("The playing handicap for " + currPlayer.getName() + " is: " + calculatePlayingHandicap(currPlayer, calculateCourseHandicap(currPlayer, slopeRating, courseRating, par)));
        }
        sc.close();
        
    }

    public static double calculateCourseHandicap(Player currPlayer, double slopeRating, double courseRating, int par){
        double courseHandicap = currPlayer.getGhinHandi() * (slopeRating/133) + (courseRating - par);
        return courseHandicap;
    }

    public static double calculatePlayingHandicap(Player currPlayer, double courseHandicap){
        double playingHandicap = courseHandicap * 0.95;
        return playingHandicap;
    }
}