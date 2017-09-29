
/**
 * Write a description of class StringNotes here.
 *
 * @author gcschmit
 * @version 29 September 2017
 */
public class StringNotes
{
    public static void main( String[] args )
    {
        /*
         * String literal
         *      is an instance of the String class (not a primitive)
         *      delineated by double quotes
         *      must be defined on a single line
         *      
         *  "Harry" is the string literal
         */
        String name = "Harry";      // equivalent to: new String( "Harry" )
        
        /*
         * String concatenation
         *      + is the string concatenation operator
         *      adds the second string operand to the end of the first string operand
         *      if one or both operands are strings, + is string
         *          concatenation (operands are converted to strings);
         *          otherwise, it is addition
         */
        String fName = "Harry";
        String lName = "Potter";
        name = fName + lName;       // "HarryPotter"
        name = fName + " " + lName; // "Harry Potter"
        
        String number = "" + 77;        // "77"
        String number2 = "" + 7 + 3;    // "73"
        String number3 = 7 + 3 + "";    // "10"
        
        /*
         * length
         *      returns the number of characters in a string
         */
        name = "Harry Potter";
        int length = name.length();     // returns 12
        
        String empty = "";
        length = empty.length();        // returns 0
        
        
        /*
         * charAt
         *      returns the character (of type char) at the specified
         *          index (0-based)
         *  
         *  H   a   r   r   y
         *  0   1   2   3   4   <- indices
         *  
         *  length = 5
         */
        name = "Harry";
        char start = name.charAt( 0 );      // returns '?'
        char end = name.charAt( 4 );        // returns '?'
        end = name.charAt( 
    }
}







