
import kareltherobot.*;
import java.awt.Color;
public class FenceBuilder extends Robot
{
    /**.
     * Constructs an object of the FenceBuilder class
     * @param y is the y cordinate
     * @param x is the x cordinate
     * @param d is the direction
     * @param n is the number
     * @param c is the color
     */
    public FenceBuilder(int y, int x, Direction d, int n, Color c)
    {
        super(y, x, d, n, c);
    } 
    /**.
     * turns right
     */
    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    /**.
     * Faces north
     */
    public void faceNorth ()
    {
        while (!facingNorth())
        {
            turnLeft();
        }
    }
    /**.
     * tests if next to beeper
     * @return true if above beeper
     */
    public Boolean aboveBeeper()
    {
        if (nextToABeeper())
        {
            for (int counter = 0; counter <= 19; counter++)
            {
                pickBeeper();
            }
            return (true);
        }
        else
            return (false);
    }
    /**.
     *Checks for right wall
     *@return if wall is right
     */
    public boolean hasRightWall()
    {
        turnRight();
        if (!frontIsClear())
        {
            turnLeft();
            return (true);
        }
        else
        {
            turnLeft();
            return (false);
        }
    }
    /**.
     *Checks for left wall
     *@return if wall is left
     */
    public boolean hasLeftWall()
    {
        turnLeft();
        if (!frontIsClear())
        {
            turnRight();
            return (true);
        }
        else
        {
            turnRight();
            return (false);
        }
    }
    /**.
     *Constructs the fence
     */
    public void constructFence()
    {
        for (int counter = 0; counter <= 19; counter++)
        {
            if (hasLeftWall())
                putBeeper();
            move();
            if (!hasLeftWall())
            {
                turnLeft();
                putBeeper();
            }
        }
    }
    /**.
     *Heads to wall
     */
    public void twaordsWall()
    {
        turnRight();
        while (!hasLeftWall())
        {
            move();
        }
    }
}