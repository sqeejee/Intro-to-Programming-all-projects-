/**
 * I have neither given nor received unauthorized aid on this assignment
 * Sam Pulaski
 * Thank you to ... for helping with ...
 */
import java.util.*;
public class BankAccountMain
{
    /**
     * Begins the bank account program
     * @param args arguements
     */
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        double startingAmount, putIn, takeOut;
        System.out.print ("How much $ is in your account?");
        startingAmount = keyboard.nextDouble ();
        BankAccount myCollegeFund = new BankAccount (startingAmount);
        System.out.print ("How much $ will you put in?");
        putIn = keyboard.nextDouble ();
        myCollegeFund.deposit (putIn);
        System.out.print ("How much $ do you wish to take out?");
        takeOut = keyboard.nextDouble ();
        myCollegeFund.withdraw (takeOut);
        System.out.println  ("I have $" + myCollegeFund.getBalance());
    }
}