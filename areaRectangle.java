import java.util.Scanner;

public class areaRectangle {
    public static void main(String[] args) {

        // calculate the area of a rectangle

        double width = 0;
        double length = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the length: ");
        length = scanner.nextDouble();

        area = length * width;

        System.out.print("The area of the rectangle is: " + area + " cm^2");
        
        scanner.close();
    }
}
