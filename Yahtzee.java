import java.util.Scanner;
import java.util.Arrays;
/**
 * Write a description of class Yahtzee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Yahtzee
{
    // instance variables - replace the example below with your own
    private static int x;
    private static int[] dice;
    private static Dice die;

    /**
     * Constructor for objects of class Yahtzee
     */
    public Yahtzee()
    {
        // initialise instance variables
        x = 0;
        dice = new int[5];
        die = new Dice();
    }
    
    private static void rollDice() {
        for (int i=0; i<dice.length; i++) {
            dice[i]=die.roll();
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean stopGame = false;
        Scorecard[] playerScores;
        System.out.println("How many players are participating?");
        int numPlayers = scan.nextInt();
        playerScores=new Scorecard[numPlayers];
        for (int i=0; i<numPlayers; i++) {
            System.out.println("Enter Player "+i+"'s name.");
            String name=scan.nextLine();
            playerScores[i]=new Scorecard(name);
        }
        System.out.println("Initializing game. Enter -1 to quit.");
        while (!stopGame) {
            for (int i=0; i<numPlayers; i++) {
                System.out.println(playerScores[i].getName()+"'s turn:");
                rollDice();
                System.out.println(Arrays.toString(dice));
                System.out.println("Enter 0 to roll again, 1 to score, -1 to quit.");
                int continuity = scan.nextInt();
                if (continuity==1) {
                    System.out.println("Enter the category you would like to score from.");
                    playerScores[i].score(dice, scan.nextLine());
                } else if (continuity==-1) {
                    System.out.print("Thanks for playing!");
                    System.exit(1);
                }
            }
        }
    }
}
