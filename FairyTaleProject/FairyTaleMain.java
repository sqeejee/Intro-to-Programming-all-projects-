/**
 * I have neither given nor received unauthorized aid on this assignment
 * Sam Pulaski
 * Thank you to ... for helping with ...
 */

import kareltherobot.*;
import java.awt.Color;

public class FairyTaleMain implements Directions
{
    public static void main (String [] args)
    {
        Kid hansel = new Kid (4, 2, East, 0, Color.green);
        Kid gretal = new Kid (7, 3, West, 0, Color.blue);
        Kid jack = new Kid (1, 7, North, 0, Color.red);
        Kid jill = new Kid (3, 5, South, 0, Color.yellow);
        hansel.keepGoingUntilWall();
        gretal.keepGoingUntilWall();
        jack.keepGoingUntilWall();
        jill.keepGoingUntilWall();
        jill.collectAllBeepers();
        jack.collectAllBeepers();
        hansel.collectAllBeepers();
        gretal.collectAllBeepers();
        jill.faceNorthNoMatterWhat();
        jack.faceNorthNoMatterWhat();
        hansel.faceNorthNoMatterWhat();
        gretal.faceNorthNoMatterWhat();
        jack.turnOff();
        jill.turnOff();
        hansel.turnOff();
        gretal.turnOff();
    }

    static
    {
        World.setVisible (true);
        World.readWorld ("world.kwld");
    }
}