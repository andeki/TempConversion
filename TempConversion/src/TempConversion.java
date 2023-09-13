public class TempConversion
{
    //double celsius to fahrenheit/kelvin methods
    public static double fToC(double f)
    {
        return ((f - 32) * 5/9);
    }

    public static double fToK(double f)
    {
        return ((f - 32) * 5/9 + 273.15);
    }

    //double fahrenheits to celsius/kelvin methods
    public static double cToF(double c)
    {
        return ((c * 9/5) + 32);
    }

    public static double cToK(double c)
    {
        return (c + 273.15);
    }

    //double kelvin to celsius/kelvin methods
    public static double kToF(double k)
    {
        return ((k-273.15) * 9/5 + 32);
    }

    public static double kToC(double k)
    {
        return (k - 273.15);
    }
}
