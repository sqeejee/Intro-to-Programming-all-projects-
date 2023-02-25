/**
 * I have neither given nor received unauthorized aid on this assignment
 * Sam Pulaski
 * Thank you to ... for helping with ...
 */
import java.util.*;
public class DataSetMain
{
    /**
     * Begins the dataSetMain program.
     * @param args arguements
     */
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        int numberadded;
        System.out.print ("Number do you want to add? ");
        numberadded = keyboard.nextInt ();
        DataSet data = new DataSet ();
        while (numberadded > 0)
        {
            data.add(numberadded);
            System.out.print ("Next Number? ");
            numberadded = keyboard.nextInt ();
        }
        System.out.print ("Your average was " + data.getAverage () + " and the biggest num you entered " + data.getMaximum ());
    }
}