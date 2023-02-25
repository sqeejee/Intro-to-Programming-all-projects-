import java.util.Scanner;

public class CubeWill
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        int number;
        System.out.print ("Enter the cubes height! ");
        number = keyboard.nextInt ();
        while (number % 2 != 0 || number >= 10)
        {
            System.out.print ("The number must be even and below 10! ");
            System.out.print ("Enter the cubes height! ");
            number = keyboard.nextInt ();
        }
        if (number == 2)
        {
            System.out.println (" *----*");
            System.out.println ("/    /|");
            System.out.println ("*----*|");
            System.out.println ("|    |*");
            System.out.println ("|    |/");
            System.out.println ("*----*|");
        }
        if (number == 4)
        {
            System.out.println ("   *--------*");
            System.out.println (" /          /|");
            System.out.println ("/         / |");
            System.out.println ("*--------*  |");
            System.out.println ("|        |  |");
            System.out.println ("|        |  *");
            System.out.println ("|        | /");
            System.out.println ("|        |/");
            System.out.println ("*-------*|");
        }
        if (number == 6)
        {
            System.out.println ("   *------------*");
            System.out.println ("  /            /|");
            System.out.println (" /            / |");
            System.out.println ("/            /  |");
            System.out.println ("*-----------*   |");
            System.out.println ("|           |   |");
            System.out.println ("|           |   |");
            System.out.println ("|           |   *");
            System.out.println ("|           |  /");
            System.out.println ("|           | /");
            System.out.println ("|           |/");
            System.out.println ("*--------- -*");
        }
        if (number == 8)
        {
            System.out.println ("   *----------------*");
            System.out.println ("  /                /|");
            System.out.println (" /                / |");
            System.out.println ("/                /  |");
            System.out.println ("/               /   |");
            System.out.println ("*---------------*   |");
            System.out.println ("|               |   |");
            System.out.println ("|               |   |");
            System.out.println ("|               |   |");
            System.out.println ("|               |   *");
            System.out.println ("|               |   /");
            System.out.println ("|               |  /");
            System.out.println ("|               | / ");
            System.out.println ("|               |/");
            System.out.println ("*---------------*");
        }
    }
}