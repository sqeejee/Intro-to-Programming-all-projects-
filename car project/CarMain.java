/**
 * I have neither given nor received unauthorized aid on this assignment
 * Sam Pulaski
 * Thank you to ... for helping with ...
 */
import java.util.*;
public class CarMain
{
    /**.
     * Begins the Car program
     * @param args arguments
     */
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        double startingGas, milespGal, milesDriven;
        System.out.print ("What is your mpg? (mile per gallon) ");
        milespGal = keyboard.nextDouble ();
        Car bmw = new Car (milespGal);
        System.out.print ("How much gas in your car? ");
        startingGas = keyboard.nextDouble ();
        bmw.addGas (startingGas);
        System.out.print ("How far do you want to drive? ");
        milesDriven = keyboard.nextDouble ();
        bmw.drive (milesDriven);
        System.out.println  ("You have " + bmw.getGasInTank() + " gallons of gas left");
    }
}