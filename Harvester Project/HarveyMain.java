/**
 * I have neither given nor received unauthorized aid on this assignment
 * Sam Pulaski
 * Thank you to ... for helping with ...
*/
import kareltherobot.*;
import java.awt.Color;
public class HarveyMain implements Directions
{
    public static void main (String [] args)
    {
        Harvester harvey = new Harvester (2, 2, East, 0, Color.green);
        harvey.move ();
        harvey.harvestTwoRows();
        harvey.positionForNextHarvest();
        harvey.harvestTwoRows();
        harvey.positionForNextHarvest ();
        harvey.harvestTwoRows();
        harvey.move ();
        harvey.turnOff ();
    }
    static
    {
        World.setVisible (true);
        World.readWorld ("field.kwld");
    }
}