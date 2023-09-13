import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Creates an object using the scanner utility
        Scanner s = new Scanner(System.in);

        //console ui
        System.out.println();
        System.out.println("...Temperature Conversion...//");
        System.out.println("Enter value of the temperature to be converted.");
        System.out.println();

        // define temperature (not changed to keep value) and result temperature
        double temp = s.nextFloat();
        double newTemp = 0;

        //console ui
        System.out.println();
        System.out.println("Please type first initial of measurement type OR its name exactly.");
        System.out.println("C for Celsius, F for Fahrenheit, K for Kelvin:");
        System.out.println();

        //Scans for Celsius or Fahrenheit
        String type = s.next();

        System.out.println();
        System.out.println("Please type first initial of /desired/ measurement type OR its name exactly.");
        System.out.println("C for Celsius, F for Fahrenheit, K for Kelvin:");
        System.out.println();

        String convertType = s.next();

        //Ensuring that the if statement does not run while type has no value
        while(!type.isEmpty())
        {
            //checks String value to see what measurement original value was

            if (type.charAt(0) == 'c' || type.charAt(0) == 'C')
            {
                //sees desired between F and K

                if (convertType.charAt(0) == 'f' || convertType.charAt(0) == 'F')
                {
                    newTemp = TempConversion.cToF(temp);
                    System.out.println("In Fahrenheit, that is: " + newTemp + "°F. Original: "+ temp +"°C");
                }
                else if (convertType.charAt(0) == 'k' || convertType.charAt(0) == 'K')
                {
                    newTemp = TempConversion.cToK(temp);
                    System.out.println("In Kelvin, that is: " + newTemp + "°K. Original: "+ temp +"°C");
                }

                System.out.println();
                break;
            }

            else if (type.charAt(0) == 'f' ||type.charAt(0) == 'F')
            {
                //sees desired between C and K
                if (convertType.charAt(0) == 'c' || convertType.charAt(0) == 'C')
                {
                    newTemp = TempConversion.fToC(temp);
                    System.out.println("In Celsius, that is: " + newTemp + "°C. Original: "+ temp +"°F");
                }
                else if (convertType.charAt(0) == 'k' || convertType.charAt(0) == 'K')
                {
                    newTemp = TempConversion.fToK(temp);
                    System.out.println("In Kelvin, that is: " + newTemp + "°K. Original: "+ temp +"°F");
                }

                System.out.println();
                break;
            }

            else if (type.charAt(0) == 'k' || type.charAt(0) == 'K')
            {
                //sees desired between C and F
                if (convertType.charAt(0) == 'c' || convertType.charAt(0) == 'C')
                {
                    newTemp = TempConversion.kToC(temp);
                    System.out.println("In Celsius, that is: " + newTemp + "°C. Original: "+ temp +"°K");
                }
                else if (convertType.charAt(0) == 'f' || convertType.charAt(0) == 'F')
                {
                    newTemp = TempConversion.kToF(temp);
                }
                System.out.println();
                System.out.println("In Fahrenheit, that is: " + newTemp + "°F. Original: "+ temp +"°K");
                break;
            }
        }
    }
}