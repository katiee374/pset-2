import java.util.Random;
/**
 * Instructions:
 * Give the dice a face value, which will be its value once it is rolled.
 * Give the dice a number of sides, which you will initalize to 6.
 * Give the dice any other instance variables you see fit.
 * Use the random object that has been intialized for you to create a 
 * roll() method.
 * Write getters and setters for your variables.
 * Give the dice a constructor, initalizing the number of sides to 6 and 
 * performing any other operation you find necessary.
 * 
 * Finally, add Javadoc to your methods, a description of the class, and
 * author and version tags. You may delete these instructions if you wish.
 * 
 * Write a description of class Dice here.
 *
 * @author CS200 Instructors
 * @version 6.13.2024
 */
public class Dice
{
    //add instance variables
    private Random rand;

    /**
     * Constructor for objects of class Dice
     */
    public Dice()
    {
        rand=new Random();
        //fill in the rest of the constructor & its arguments
    }
    
    public int roll() {
        return rand.nextInt(6)+1;
    }
    //write getters, setters, and roll() method
}
