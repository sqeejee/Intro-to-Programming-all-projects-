/**
 * I have neither given nor received unauthorized aid on this assignment
 * Sam Pulaski
 * Thank you to ... for helping with ...
 */
import java.util.*;
public class InvestmentMain
{
    /**
     * Begins the InvestMain program.
     * @param args arguements
     */
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        int finalgoal;
        double bal, intperc;
        System.out.print ("What is your dream money goal? ");
        finalgoal = keyboard.nextInt ();
        System.out.print ("How much are you starting with investing? ");
        bal = keyboard.nextDouble ();
        System.out.print ("What percent interest do you want yearly? ");
        intperc = keyboard.nextDouble ();
        Investment bank = new Investment (bal, intperc);
        bank.waitForBalance((double) finalgoal);
        System.out.println ("It took " + bank.getYears () + " years to reach your goal of " + finalgoal + "$");
    }
}