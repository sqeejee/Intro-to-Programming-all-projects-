
/**
 * Mesaures and returns the description of earthquakes.
 *
 * @author Sam Pulaski 
 * @version 4.19.21
 */
public class Earthquake
{
    /**
     * Constructs a double of the earthquake class.
     * @param scale the magnitude of the earthquake
     */
    private double magnitude;
    /**
     * Initilizes earthquake class.
     * @param scale the scale of earthquake
     */
    public Earthquake (double scale)
    {
        magnitude = scale;
    }

    /**
     * Returns a description of the earthquake.
     * @return description based on magnitude
     */
    public String getDescription ()
    {
        String desc;
        if (magnitude <= 2)
            desc = "Not felt by people.";
        else if (magnitude <= 4)
            desc = "Felt little by people.";
        else if (magnitude <= 5)
            desc = "Walls crack.";
        else if (magnitude <= 6)
            desc = "Walls crack.";
        else if (magnitude <= 7)
            desc = "Furniture moves.";
        else if (magnitude <= 8)
            desc = "Many buildings destroyed.";
        else
            desc = "Total destruction of buildings, bridges, and roads.";
        return (desc);
    }
}
