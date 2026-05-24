import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        // Scanner is used to take input
        Scanner scanner = new Scanner(System.in);

        // accepting a string
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // accepting an integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // accepting a double
        System.out.print("What is your GPA?: ");
        double gpa = scanner.nextDouble();

        // accepting a boolean
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your GPA is: " + gpa);

        // if statement for boolean
        if (isStudent) {
            System.out.println("I guess you are not that stupid!");
        } else {
            System.out.println("You failed at life!");
        }

        // common errors
        // if input an integer first, then a newline character appears first
        // so you must clear the input buffer first
        System.out.print("Enter your age again: ");
        int newAge = scanner.nextInt();
        scanner.nextLine();         // This clears the input buffer.

        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        System.out.println("Your new age is: " + newAge);
        System.out.println("Your favorite color is: " + color);
        
        // You should always close the scanner
        scanner.close();
    }
}
