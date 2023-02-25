/**
 * I have neither given nor received unauthorized aid on this assignment
 * Sam Pulaski
 * Thank you to ... for helping with ...
 */

import kareltherobot.*;
import java.awt.Color;

public class AbeMain implements Directions
{
    /**
     *  @param args arguements
     */
    public static void main (String [] args)
    {
        /**
         * Constructs an object of the areaMeasurer class
         */
        AreaMeasurer abe = new AreaMeasurer(1, 1, East, infinity, Color.blue);
        while (abe.frontIsClear())
        {
            abe.measureWid ();
        }
        abe.turnLeft();
        while (abe.frontIsClear())
        {
            abe.measureVert ();
        }
        abe.turnLeft ();
        abe.turnLeft ();
        abe.returnPos ();
        abe.displayArea ();
        abe.turnOff();
    }
    static
    {
        World.setVisible (true);
        World.readWorld ("room.kwld");
        World.setDelay (10);
    }
}