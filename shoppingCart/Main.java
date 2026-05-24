package shoppingCart;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Shopping Cart Program

        Scanner scanner = new Scanner(System.in);

        // Variable Declarations
        String item;
        double price;
        int quantity;
        char currency = '$';
        double total = 0;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        total = quantity * price;

        System.out.println("You have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);


        scanner.close();
    }

}
