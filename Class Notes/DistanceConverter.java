public class DistanceConverter
{   
    public static final double FEET_FOR_EVERY_YARD = 3;
    public static final double INCHES_FOR_EVERY_FOOT = 12;

    public static void main(String[] args)
    {
        double yards = 3.5;
        double feet = yards * FEET_FOR_EVERY_YARD;
        double inches = feet * INCHES_FOR_EVERY_FOOT;

        System.out.println(yards + " yards are " + feet + " feet");
        System.out.println(yards + " yards are " + inches + " inches");
    }
}