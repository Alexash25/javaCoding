package randomNumbers;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int number1;
        int number2;
        int number3;

        // first number is inclusive, last number is exclusive
        number1 = random.nextInt(1,7);
        number2 = random.nextInt(1,7);
        number3 = random.nextInt(1,7);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        // generate random doubles
        double numDouble;

        numDouble = random.nextDouble();

        System.out.println(numDouble);

        // you can also randomize bools
    }
}
