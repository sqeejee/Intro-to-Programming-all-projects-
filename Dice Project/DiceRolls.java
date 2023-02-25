/**
 * I have neither given nor received unauthorized aid on this assignment
 * Sam Pulaski
 * Thank you to ... for helping with ...
 */
import java.util.*;

public class DiceRolls
{
    public static void main (String [] args)
    {
        Scanner kb = new Scanner (System.in);
        int numRolls, die1, die2, total;
        int [] outcomes = new int [13];      
        System.out.println ("How many rolls? ");
        numRolls = kb.nextInt ();

        for (int i = 0; i <= 12  ; i++)
        {
            outcomes [i] = 0;
        }

        for (int index = 1; index <= numRolls; index++)
        {
            die1 = (int) (Math.random () * 6) + 1;
            die2 = (int) (Math.random () * 6) + 1;
            total = die1 + die2;

            outcomes [total]++;
        }
        
        for (int index = 2; index <= 12; index++)
        {
            System.out.println (index + ": " + outcomes [index]);
        }
    }
}


