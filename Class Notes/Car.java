
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
     *      specify the name (e.g., fuelEfficiency, fuelInTank)
     *      
     *  Instance variables differ from local variables in the following ways:
     *      scoped to their class (accessible for all methods)
     *      automatically initialized to a default value (0, false, null)
     */
    private double fuelEfficiency; // in units of miles per gallon
    private double fuelInTank; // in units of gallons
    
    
    /*
     * Constructor:
     *      responsible for initializing newly created objects
     *      invoked automatically via new operator
     *      name of the constructor must match the name of class
     *      has no return type (not even void)
     *      multiple constructors may be defined for a class
     *      one constructor may call another constructor (with restrictions)
     */
    
    /**
     * Default constructor for the Car class.
     *      Initializes the fuel efficiency to 30 mpg and the fuel in this car's
     *      tank to 0 gallons.
     */
    public Car()
    {
        /*
         * The "this" reserved word references the current object
         *      (like self in Python)
         *  Its usage is encouraged but usually not required.
         */
        this.fuelEfficiency = 30;
        this.fuelInTank = 0;
    }
    
    /**
     * Constructs a new Car object with the specified fuel efficiency
     * 
     * @param initialEfficiency the initial fuel efficiency, in miles per gallon,
     *                       of this new car
     */
    public Car( double initialEfficiency )
    {
        /*
         * If the parameter was named fuelEfficiency, it woudl "shadow" the
         *      instance variable fuelEfficiency.
         *  Local and parameter variables "shadow" instance variables of
         *      the same name. In this code, fuelEfficiency would refer to
         *      the parameter and not the instance variable.
         *  To refer expliclty to an instance variable, use "this"
         *  Advice: avoid this issue by giving parameters unique names!
         */
        this.fuelEfficiency = initialEfficiency;
        this.fuelInTank = 0;
    }
    
    /*
     * When defining a method, specify:
     *      the visibilty (e.g., public)
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
        this.fuelInTank -= ( distance / this.fuelEfficiency );
    }
    
    /**
     * Adds the specified amount of fuel to this car's tank
     * 
     * @param amount the amount of fuel, in gallons, to add to this car's tank
     */
    public void addGas( double amount )
    {
        this.fuelInTank += amount;
    }
    
    /**
     * Returns the amount of fuel in this car's tank
     * 
     * @return the amount of fuel, in gallons, in this car's tank
     */
    public double getGasInTank()
    {
        return this.fuelInTank;
    }
    
    
    /**
     * Returns a String that describes this object.
     * 
     * @return a String that describes this object
     */
    public String toString()
    {
        String str = "fuel efficiency: " + this.fuelEfficiency +
                "; fuel in tank: " + this.fuelInTank;
        return str;
    }
}







