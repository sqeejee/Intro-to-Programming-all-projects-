import kareltherobot.*;
import java.awt.Color;
public class Kid extends Robot
{
    public Kid(int y, int x, Direction d, int n, Color c)
    {
        super(y, x, d, n, c);
    }
    public void keepGoingUntilWall ()
    {
        while (frontIsClear())
        {
            move();
        }
    }
    public void collectAllBeepers ()
    {
        while (nextToABeeper())
        {
            pickBeeper();
        }
    }
    public void faceNorthNoMatterWhat ()
    {
        while (!facingNorth())
        {
            turnLeft();
        }
    }
}