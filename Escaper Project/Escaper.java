import kareltherobot.*;
import java.awt.Color;
public class Escaper extends Robot
{
    public Escaper(int y, int x, Direction d, int n, Color c)
    {
        super(y, x, d, n, c);
    }
    public void turnRight ()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public boolean hasLeftWall ()
    {
        turnLeft();
        if (!frontIsClear())
        {
            turnRight();
           return (true);
        }
        else
        {
            return (false);
        }
    }
    public boolean hasRightWall ()
    {
        turnRight();
        if (!frontIsClear())
        {
            turnLeft();
            return (true);
        }
        else
        {
            return (false);
        }
    }
    public void celebrate ()
    {
        turnRight();
        turnLeft();
    }
    public void faceSouth ()
    {
        while (!facingSouth())
        {
            turnRight();
        }
    }
    public void climbDownWithoutCrashingIntoGround()
    {
        while (!frontIsClear())
        {
            move();
        }
    }
    public void faceNorth ()
    {
        while (!facingNorth())
        {
            turnRight();
        }
    }
}