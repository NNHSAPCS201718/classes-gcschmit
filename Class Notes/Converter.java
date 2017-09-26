
/**
 * Write a description of class Converter here.
 *
 * @author gcschmit
 * @version 26 September 2017
 */
public class Converter
{
    public static double calculateAreaOfCircle( double radius )
    {
        /*
         * Instead of using a "magic number" (e.g., 3.14159), use
         *      constants defined by the Java Standard Library.
         *      
         *  For example, in Math.java:
         *  
         *  public static final double PI = 3.141592654;
         *  
         *  Static: one value for the variable for all objects of the class;
         *              can be accessed directly through the class
         *              (e.g., Math.PI)
         */
        double area = Math.PI * radius * radius;
        return area;
    }
    
    public static double convertFeetToLightyears( double feet )
    {
        /*
         * Declare a constant with the final keyword.
         * 
         *  If we try to change the value, a compiler error will be generated.
         */
        final double LIGHTYEARS_FOR_EVERY_FOOT = 3.22174e-17;
        
        double lightYears = feet * LIGHTYEARS_FOR_EVERY_FOOT;
        
        // LIGHTYEARS_FOR_EVERY_FOOT = 2;
        
        return lightYears;
    }
}





