/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Thank you to ... for helping with ...
 * Sam Pulaski
 */

import kareltherobot.*;
import java.awt.Color;
public class KarelMain implements Directions
{
    public static void main (String [] args)
    {
        Robot karel = new Robot (1, 1, East, 0, Color.red); // makes karel exist
        karel.move();
        karel.move();
        karel.pickBeeper();
        karel.move();
        karel.move();
        karel.move();
        karel.pickBeeper();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.pickBeeper();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.pickBeeper();         
    }

    static
    {
        World.setVisible(true);
        World.setWorldColor (Color.cyan);
        World.setDelay (12);
        World.readWorld ("test.kwld");
    }
}