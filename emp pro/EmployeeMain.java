/**
 * I have neither given nor received unauthorized aid on this assignment
 * Sam Pulaski
 * Thank you to ... for helping with ...
 */
import java.util.*;
public class EmployeeMain
{
    /**.
     * Begins the emeployee program
     * @param args arguements
     */
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        double moneys, percRaise;
        String name;
        System.out.print ("What is your employee's name?");
        name = keyboard.nextLine ();
        System.out.print ("What is your employees salary ");
        moneys = keyboard.nextDouble ();
        Employee intern = new Employee(name, moneys);
        System.out.print ("By what percent are you raising your employee's Salary ");
        percRaise = keyboard.nextDouble ();
        intern.raiseSalary (percRaise);
        System.out.println  ("Your employee," + name + " has a sallary of " + intern.getSalary());
    }
}