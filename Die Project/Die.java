/**
 * Creates a die, rolls it, finds out if it is odd or not, and even gets the chance of rolling a one.
 * @author Sam Pulaski 
 * @version 4.23.21
 */
public class Die
{
    private int sides, number;
    private double odds;
    /**
     * Constructs three ints of the die class.
     * @param side the percent interest increase
     */
    public Die (int side)
    {
        sides = side;
    }

    /**
     * Rolls the dice and returns a number.
     * @return number is the selected/random number rolled onto.
     */
    public int getRoll ()
    {
        number = (int) (Math.random () * sides) + 1;
        return (number);
    }

    /**
     * Sees if th e dice has an even number of sides.
     * @return true if the number of sides is divisible by 2, false is else
     */
    public boolean hasEvenNumberOfSides ()
    {
        if (sides % 2 == 0)
        {
            return (true);
        }
        else
            return (false);
    }

    /**
     * Rolls the dice and returns a number.
     * @return odds the chance of rolling a one.
     */
    public double getOdds ()
    {
        odds = (double) 1 / sides;
        return (odds);
    }
}
