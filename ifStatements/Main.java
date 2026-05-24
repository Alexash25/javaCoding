package ifStatements;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // if statement = performs a block of code if its condition is true
        String name;
        int age;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        // Group 1
        // check if name variable is empty
        if (name.isEmpty()) {
            System.out.println("You didn't enter your name!");
        } else {
            System.out.println("Hello, " + name);
        }
        
        // Group 2
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else if (age > 0) {
            System.out.println("You haven't been born yet.");
        } else {
            System.out.println("You are a young lad.");
        }

        scanner.close();

    }
}
