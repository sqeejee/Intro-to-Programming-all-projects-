/**
 * I have neither given nor received unauthorized aid on this assignment
 * Sam Pulaski
 * Thank you to ... for helping with ...
 */

import kareltherobot.*;
import java.awt.Color;

public class EstellaMain implements Directions
{
    public static void main (String [] args)
    {
        Escaper estella = new Escaper(1, 1, South, 0, Color.blue);
        estella.faceNorth ();
        while (estella.hasRightWall())
        {
            estella.move();
        }
        estella.celebrate ();
        estella.faceSouth ();
        estella.climbDownWithoutCrashingIntoGround ();
        estella.faceNorth ();
        estella.turnOff ();
    }

    static
    {
        World.setVisible (true);
        World.readWorld ("hatch.kwld");
    }
}