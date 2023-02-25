/**
 * This BankAccount class has a balance that can be changed by deposits & withdrawals.
 * @author Sam Pulaski
 * @version 03.16.21
 */
public class BankAccount 
{
    private double balance;

    /**
     * Constructs an object of the BankAccount class with no $.
     */
    public BankAccount ()
    {
        balance = 0;
    }

    /**
     * Constructs an object of the BankAccount class with a starting amount of $.
     * @param initialBalance $ you start off with
     */
    public BankAccount (double initialBalance)
    {
        balance = initialBalance;
    }

    /**
     * Deposits a given amount of $ into the bank account.
     * @param amount $ you deposit
     */
    public void deposit (double amount)
    {
        balance = balance + amount;
    }

    /**
     * Withdraws a given amount of $ out bank account.
     * @param amount $ you withdraw
     */
    public void withdraw (double amount)
    {
        balance = balance - amount;
    }

    /**
     * Gets the current amount of $ in the bank account.
     * @return The current amount of $ in your bank account
     */
    public double getBalance()
    {
        return (balance);
    }
}
