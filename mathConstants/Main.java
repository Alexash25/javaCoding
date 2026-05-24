package mathConstants;

public class Main {
    public static void main(String[] args) {

        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result1;
        double result2;
        
        result1 = Math.pow(2,5);
        result2 = Math.abs(-5);

        System.out.println(result1);
        System.out.println(result2);

        // you can use Math.ceil() to round up
        // you can use Math.round() to round
        // you can use Math.floor() to round down

        // Math.max(10, 20) will find the max
        // Math.min(10, 20) will find the min

        // use System.out.printf("The circumference is: %.1fcm", circumference);
    }
}
