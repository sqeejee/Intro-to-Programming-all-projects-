import kareltherobot.*;
import java.awt.Color;
public class BeeperTrailer extends Robot
{
    /**.
     * The Trailer @piram
     */
    /**.
     * x is soemthign @piram
     * so i y @piram
     * n is @piram
     * d is @piram
     * c is @piram
     */
    public BeeperTrailer(int y, int x, Direction d, int n, Color c)
    {
        super(y, x, d, n, c);
    }
    /**.
     * Makes the robot turn around
     */
    public void turnAround ()
    {
        turnLeft();
        turnLeft();
    }
    /**.
     * Makes the robot turn right
     */
    public void turnRight ()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    /**
     * Follows trail of beepers.
     * Determines if theree's a beeper in front
     * @return if there's a beeper in front, false otherwise
     */
    public boolean hasFrontBeeper ()
    {
        move ();
        if (nextToABeeper())
        {
            turnAround();
            move();
            turnAround();
            return (true);
        }
        else
        /**
         * @returns the true or false
         */
            return (false);
    }
    /**.
     * Makes the robot check for left beeper
     * * @returns true or fasle
     */
    public boolean hasLeftBeeper ()
    {
        turnLeft();
        move ();
        if (nextToABeeper())
        {
            turnAround();
            move();
            turnLeft();
            /**
         * @returns the true or false
         */
            return (true);
        }
        else
            return (false);
    }
    /**.
     * Makes the robot check for right beeper
     * @returns true or fasle
     */
    public boolean hasRightBeeper ()
    {
        turnRight();
        move ();
        if (nextToABeeper())
        {
            turnAround();
            move();
            turnRight();
            return (true);
        }
        else
            return (false);
    }
    /**.
     * Makes the robot get front beeper
     */
    public void getFrontBeeper ()
    {
        move();
        pickBeeper();
    }
    /**.
     * Makes the robot get left beeper
     */
    public void getLeftBeeper ()
    {
        turnLeft();
        move();
        pickBeeper();
    }
    /**.
     * Makes the robot get the right beeper
     */
    public void getRightBeeper ()
    {
        turnRight();
        move();
        pickBeeper();
    }
    /**.
     * Makes the robot follow the trail
     */
    public void followBeeperTrail ()
    {
        if (hasFrontBeeper ())
            getFrontBeeper ();
        else if (hasLeftBeeper())
            getLeftBeeper ();
        else
            getRightBeeper();
    }
}