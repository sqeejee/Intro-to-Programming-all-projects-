/**
 * I have neither given nor received unauthorized aid on this assignment
 * Sam Pulaski
 * Thank you to ... for helping with ...
 */
public class NamesArray
{
    public static void main (String [] args)
    {
        String [] girlNames = new String [3];
        String [] boyNames = new String [3];

        girlNames [0] = "Olivia";
        girlNames [1] = "Emma";
        girlNames [2] = "Ava";

        boyNames [0] = "Liam";
        boyNames [1] = "Noah";
        boyNames [2] = "Oliver";

        for (int i = 0; i < 3; i++)
        {
            System.out.println (girlNames [i]);
        }
        
        for (int i = 2; i > -1; i--)
        {
            System.out.println (boyNames [i]);
        }
        
        for (int i = 0; i < 3; i++)
        {
            System.out.println (girlNames[i].toUpperCase());
        }
    }
}