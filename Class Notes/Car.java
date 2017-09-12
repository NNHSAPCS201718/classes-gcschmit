
/**
 * This class models a car.
 *
 * @author gcschmit
 * @version 11 September 2017
 */
public class Car
{
    /*
     * Instance variables store the object's properties
     *      specify the visibility (e.g., private)
     *          public: accessible by anyone
     *          private: only accessible by methods in this class
     *      specify the type (e.g., double)
     *      specify the name (e.g., fuelEfficiency)
     *  
     *  Instance variables differ from local variables in the following ways:
     *      scoped to their object (accessible from all methods)
     *      automatically initialized to a default value (0, false, null)
     */
    private double fuelEfficiency; // in units of miles per gallon
    private double fuelInTank; // in units of gallons
    
    /*
     * Constructor:
     *      responsible for intializing newly created objects
     *      invoked automatically via the new operator
     *      name of the constructor must match the name of the class
     *      has no return type (not even void)
     *      multiple constructors may be defined for a class
     *      one constructor may call another constructor (with restrictions)
     */
    
    /**
     * Default constructor for the Car class.
     *  Sets the fuel efficiency to 30 mpg.
     */
    public Car()
    {
    }
    
    /**
     * Constructs a Car object with the specified initial fuel efficiency.
     * 
     * @param initialEfficiency the initial fuel efficiency, in miles per gallon,
     *                          of this new car
     */
    public Car( double initialEfficiency )
    {
    }
    
    /*
     * When defining a method, specify:
     *      the visibility (e.g., public)
     *      the return type (e.g., void)
     *      the method name (e.g., drive)
     *      the parameters and their types (e.g., distance of type double)
     */
    /**
     * Drives this car the specified distance, consuming fuel
     * 
     * @param distance the distance, in miles, this car drives
     */
    public void drive( double distance )
    {
    }
    
    /**
     * Adds the specified amount of fuel to this car's tank
     * 
     * @param amount the amount of fuel, in gallons, to add to this car's tank
     */
    public void addGas( double amount )
    {
    }
    
    /**
     * Returns the amount of fuel in this car's tank
     * 
     * @return the amount of fuel, in gallons, in this car's tank
     */
    public double getGasInTank()
    {
        return 0;
    }
}




