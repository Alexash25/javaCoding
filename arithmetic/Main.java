package arithmetic;

public class Main {
    public static void main(String[] args) {
        // arithmetic operators

        int x = 10;
        int y = 2;
        int z;

        // z = x + y;
        z = x - y;

        if (x % y == 0) {
            System.out.println("It is divisible by two");
        }
        else {
            System.out.println("It is NOT divisible by two");
        }

        System.out.println(z);
    }
}
