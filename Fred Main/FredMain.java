/**
 * I have neither given nor received unauthorized aid on this assignment
 * Sam Pulaski
 * Thank you to ... for helping with ...
 */

import kareltherobot.*;
import java.awt.Color;

public class FredMain implements Directions
{
    /**
     *  @param args arguements
     */
    public static void main (String [] args)
    {
        /**
         * Constructs an object of the FenceBuilder class
         */
        FenceBuilder fred = new FenceBuilder(1, 1, East, 0, Color.blue);
        fred.faceNorth();
        while (!fred.aboveBeeper())
        {
            fred.move();
        }
        fred.twaordsWall();
        fred.constructFence();
        fred.turnOff();
    }
    static
    {
        World.setVisible (true);
        World.readWorld ("building.kwld");
        World.setDelay (10);
    }
}