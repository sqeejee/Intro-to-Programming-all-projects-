
/**
 * I have neither given nor received unauthorized aid on this assignment
 * Sam Pulaski
 * Thank you to ... for helping with ...
 */
import java.util.*;
public class EncryptionMain
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        String phrase, symbolW, hideW;
        char symbol, hide;
        System.out.print ("What word would you like to encypt? ");
        phrase = keyboard.next ();
        Encryption word = new Encryption (phrase);
        System.out.print ("What letter are you trying to hide? ");
        hideW = keyboard.next ();
        System.out.print ("What symbol will you replace it with? ");
        symbolW = keyboard.next ();
        hide = hideW.charAt (0);
        symbol = symbolW.charAt (0);
        System.out.print (word.getEncodedWord (hide, symbol));
    }
}
