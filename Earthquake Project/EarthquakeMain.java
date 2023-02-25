/**
 * I have neither given nor received unauthorized aid on this assignment
 * Sam Pulaski
 * Thank you to ... for helping with ...
 */
import java.util.*;
public class EarthquakeMain
{
    /**
     * Begins the EarthquakeMain program.
     * @param args arguements
     */
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        double magnitude;
        System.out.print ("What is the magnitude of your earthquake? ");
        magnitude = keyboard.nextDouble ();
        Earthquake shake = new Earthquake (magnitude);
        System.out.println (shake.getDescription ());
    }
}