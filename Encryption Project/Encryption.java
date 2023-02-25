public class Encryption
{
    private String word;
    public Encryption (String aWord)
    {
        word = aWord;
    }
    public String getEncodedWord (char normal, char symbol)
    {
        String newW = "";
        for (int index = 0; index <= word.length () - 1; index++)
        {
            char let = word.charAt (index);
            if (let == normal)
            {
                newW = newW + symbol;
            }
            else
            {
                newW = newW + let;
            }
        }
        return (newW);
    }
}
