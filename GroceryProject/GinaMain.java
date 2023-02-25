/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Thank you to ... for helping with ...
 * Sam Pulaski
 */

import kareltherobot.*;
import java.awt.Color;
public class GinaMain implements Directions
{
    public static void main (String [] args)
    {
        Robot karel = new Robot (5, 7, East, 0, Color.blue); // makes karel exist
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.pickBeeper();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickBeeper();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickBeeper();
        karel.move();
        karel.pickBeeper();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.turnOff();
    }

    static
    {
        World.setVisible(true);
        World.setWorldColor (Color.cyan);
        World.setDelay (10);
        World.readWorld ("house.kwld");
    }
}