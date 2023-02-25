/**
 * I have neither given nor received unauthorized aid on this assignment
 * Sam Pulaski
 * Thank you to ... for helping with ...
 */
import java.util.*;
public class DieMain
{
    /**
     * Begins the DieMain program.
     * @param args arguements
     */
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        int sides, roles;
        System.out.println ("How many sides doees your die have? ");
        sides = keyboard.nextInt ();
        Die dice = new Die (sides);
        System.out.print ("How many times are you rolling? ");
        roles = keyboard.nextInt ();
        for (int goes = 1; goes <= roles; goes++)
        {
            System.out.println (dice.getRoll ());
        }
        System.out.println ("You only had a " + dice.getOdds () + "% chance of rolling a one!");
    }
}