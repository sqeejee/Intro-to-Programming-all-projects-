import kareltherobot.*;
import java.awt.Color;
public class Harvester extends Robot
{
    public Harvester(int y, int x, Direction d, int n, Color c)
    {
        super (y, x, d, n, c);
    }

    public void harvestTwoRows()
    {
        harvestOneRow();
        goToNextRow();
        harvestOneRow();
    }

    public void positionForNextHarvest()
    {
        turnRight();
        move();
        turnRight();
    }

    private void turnRight() //private methods can only be used in this file - Public tries to help private
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    private void harvestOneRow()
    {
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
    }

    private void  goToNextRow()
    {
        turnLeft();
        move();
        turnLeft();
    }
}