import kareltherobot.*;
import java.awt.Color;
public class AreaMeasurer extends Robot
{
    private int vertdistance;
    private int witdistance;
    private int area;
    /**.
     * Constructs an object of the areaMeasurer class and sets distance to zero
     * @param y is the y cordinate
     * @param x is the x cordinate
     * @param d is the direction
     * @param n is the number
     * @param c is the color
     */
    public AreaMeasurer(int y, int x, Direction d, int n, Color c)
    {
        super(y, x, d, n, c);
        witdistance = 0;
        vertdistance = 0;
        area = 0;
    } 
    /**.
     * Measure the width
     */
    public void measureWid()
    {
        while (frontIsClear())
        {
            move();
            witdistance++;
        }
    }
    /**.
     * Measure the height
     */
    public void measureVert()
    {
        while (frontIsClear())
        {
            move();
            vertdistance++;
        }
    }
    /**.
     * Returns to orginal position
     */
    public void returnPos ()
    {
        for (int returndistance = 1; returndistance <= vertdistance; returndistance++)
        {
            move();
        }
        turnLeft();
        turnLeft();
        turnLeft();
        for (int witrdistance = 1; witrdistance <= witdistance; witrdistance++)
        {
            move();
        }
        turnLeft();
        turnLeft();
    }
    /**.
     * Displays araea of rect
     */
    public void displayArea ()
    {
        area = witdistance * vertdistance;
        for (int adisplay = 1; adisplay <= area; adisplay++)
        {
            putBeeper();
        }
    }
}