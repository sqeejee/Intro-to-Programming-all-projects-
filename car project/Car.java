/**
 * This Car class consists of a gas tank and a fuel efficency and can drive a certain number of miles, add gas to the tank, and get the current amount of fuel in the tank.
 * @author Sam Pulaski
 * @version 3/18/21
 */
public class Car
{
    // instance variables - replace the example below with your own
    private double gas;
    private double mpg;
    /**
     * Constructs an object of the Car class with empty gas tank and given fuel efficeny.
     * @param fuelEfficency the number/miles per gallon you enter
     */
    public Car(double fuelEfficency)
    {
        mpg = fuelEfficency;
        gas = 0;
    }
    /**
     * Adds a selected amount of gallons of gas to the tank.
     * @param gallons amount of gas you fill the car with
     */
    public void addGas (double gallons)
    {
        gas = gas + gallons;
    }
    /**
     * Drives for a selected amount of miles and reduces gas in tank relative to the fuel efficiency.
     * @param miles miles you decide to drive/enter
     */
    public void drive (double miles)
    {
        gas = gas - (miles / mpg);
    }
    /**
     * Gets the amount of gas that is left in your tank
     * @return your gas left in tank
     */
    public double getGasInTank()
    {
        return (gas);
    }   
    /**
    myHybrid.addGas(20); // Tank 20 gallons
    myHybrid.drive(100); //Drive 100 miles
    double gasLeft = myHybrid.getGasInTank();
     */
}
