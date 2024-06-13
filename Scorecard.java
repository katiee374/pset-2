import java.util.Hashtable;

/**
 * Write appropriate Javadoc for this class (what methods do, the arguments
 * they take and what they return, as well as a description of the class as
 * a whole).
 * 
 * Write a description of class Scorecard here.
 *
 * @author CS200 Instructors
 * @version 6.13.2024
 */
public class Scorecard
{
    // instance variables - replace the example below with your own
    private int upperScore;
    private int lowerScore;
    private Hashtable<String, Integer> scores;

    public void printScoreCard() {
        System.out.println("Aces: "+scores.get("aces"));
        System.out.println("Twos: "+scores.get("twos"));
        System.out.println("Threes: "+scores.get("threes"));
        System.out.println("Fours: "+scores.get("fours"));
        System.out.println("Fives: "+scores.get("fives"));
        System.out.println("Sixes: "+scores.get("sixes"));
        System.out.println("Upper Section: "+upperScore);
        System.out.println("3 of a kind: "+scores.get("3ofkind"));
        System.out.println("4 of a kind: "+scores.get("4ofkind"));
        System.out.println("Full House: "+scores.get("fh"));
        System.out.println("Small Straight: "+scores.get("smstr8"));
        System.out.println("Large Straight: "+scores.get("lgstr8"));
        System.out.println("Yahtzee: "+scores.get("yahtzee"));
        System.out.println("Chance: "+scores.get("chance"));
        System.out.println("Yahtzee Bonus: "+scores.get("bonus"));
        System.out.println("Lower Section: "+lowerScore);
        System.out.println("Grand Total: "+(upperScore+lowerScore));
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
}
