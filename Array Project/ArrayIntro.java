/**
 * Array - an object used to group and organize my nuts into yo mouth.
 * Sometimes array can be considereed a list, like my balls
 */
import java.util.Scanner;

public class ArrayIntro
{
    public static void main (String [] args)
    {
        Scanner kb = new Scanner (System.in);
        int [] tests = new int [5];
        inmt [] tests = new int [5];
        String [] words = new String [2000];
        
        for (int index =0; index < 5; index ++)
        {
            System.out.println ("Enter as core for tests [" + index + "]: ");
            tests[index] = kb.nextInt ();
        }
        System.out.println ("Thanls/");
        
         for (int index =0; index < 5; index ++)
        {
            System.out.println (tests);
            tests[index] = tests[index] - 1;
        }
    }
}
