

public class dz9 {
    public static boolean isLeapYear(int year)
    {
        if (year %400==0)
        {
            return true;
        } else if (year %100==0)
        {
            return false;
        } else if (year %4==0)
        {
            return true;
        } else {
            return false;
        }
    }
}
public static void main(String[] args)
{
    System.out.println("1900:" + dz9.isLeapYear(1900));}
