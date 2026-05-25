package fahrenheitToCelsius;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // That was my attempt lol. now I will do BroCode way
        // // FAHRENHEIT TO CELSIUS USING TERNARY OPERATOR
        // // initialize variables
        // Scanner scanner = new Scanner(System.in);

        // double temp;
        // double newTemp;
        // int choice;
        // String output;

        // // Welcome Statement
        // System.out.println("Welcome to temperature converter");;
        // System.out.print("Enter 1 C to F. Enter 2 for F to C: ");
        // choice = scanner.nextInt();

        // System.out.print("Enter value (Celsius or Fahrenheit): ");
        // temp = scanner.nextDouble();

        // // Write ternary operation
        // newTemp = (choice == 1) ? (9 / 5) * temp + 32.0 : (5 / 9) * (temp - 32);

        // // Print output
        // output = (choice == 1) ? "The temperature in fahrenheit is " + newTemp : "The temperature in Celsius is " + newTemp;

        // System.out.println(output);

        // scanner.close();

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;
        
        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase(); // grab single character. This is method chaining

        // Ternary operation
        newTemp = (unit.equals("C")) ?  (5 / 9) * (temp - 32) : (9 / 5) * temp + 32.0;

        System.out.printf("%.1f°%s", newTemp, unit);

        scanner.close();
    }
}
