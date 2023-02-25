/**
 * Mesaures and returns the description of earthquakes.
 *
 * @author Sam Pulaski 
 * @version 4.22.21
 */
public class DataSet
{
    private double max, sum;
    private int count;
    /**
     * Constructs three ints of the dataSet class.
     */
    public DataSet ()
    {
        max = 0;
        count = 0;
        sum = 0;
    }

    /**
     * This will add integers as well as find the max.
     * @param number is the number entered by the user!
     */
    public void add (double number)
    {
        count++;
        sum = sum + number;
        if (number > max)
        {
            max = number;
        }
    }
    /**
     * Gets the average of the numbers entered.
     * @return average of entered numbers
     */
    public double getAverage ()
    {
        return (sum / count);
    } 
    /**
     * Gets the biggest number entered.
     * @return biggest numbers
     */
    public double getMaximum ()
    {
        return (max);
    }
}
