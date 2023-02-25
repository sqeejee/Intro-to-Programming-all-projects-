/**
 * Mesaures and returns the description of earthquakes.
 *
 * @author Sam Pulaski 
 * @version 4.19.21
 */
public class Investment
{
    private double bal, intperc;
    private int yrs;
    /**
     * Constructs three ints of the Investment class.
     * @param balance balance in bank
     * @param interest the percent interest increase
     */
    public Investment (double balance, double interest)
    {
        bal = balance;
        intperc = interest;
    }
    /**
     * Waits for the balance to reach the desired goal.
     * @param goal the goal/desired money entered by the user
     */
    public void waitForBalance (double goal)
    {
        while (bal < goal)
        {
            bal = bal + (bal * intperc) / 100;
            yrs++;
        }
    }
    /**
     * Finds the total years you waited.
     * @return years waited
     */
    public int getYears ()
    {
        return (yrs);
    }
}
