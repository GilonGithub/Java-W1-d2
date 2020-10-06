import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class CelciusToFahrenheit {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the Celsius value: ");
        double C = input.nextDouble();
        
        System.out.println("Celcius to Fahrenheit is " + ((C * (9.0/5)) + 32));


    }
}