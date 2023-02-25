/**
 * I have neither given nor received unauthorized aid on this assignment
 * Sam Pulaski
 * Thank you to ... for helping with ...
 */

import kareltherobot.*;
import java.awt.Color;

public class BeaMain implements Directions
{
    /**
     *  @param args arguements
     */
    public static void main (String [] args)
    {
        BeeperTrailer bea = new BeeperTrailer(2, 2, East, 0, Color.blue);
        if (!bea.nextToABeeper())
        {
            bea.followBeeperTrail ();
        }
        else
        {
            bea.turnOff();
        }
    }
    static
    {
        World.setVisible (true);
        World.readWorld ("trail1.kwld");
    }
}