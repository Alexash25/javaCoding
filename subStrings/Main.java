package subStrings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");

        // .substring() = A method used to extract a portion of a string
        // string.substring(start, end)

        // create an email slicer program
        email = scanner.nextLine();

        if (email.contains("@")) {
            // substring is exclusive at the end
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf('@') + 1);

            System.out.println("A good username for you would be: " + username);
            System.out.println("Domain of your email: " + domain);
        } else {
            System.out.println("Emails must contain '@'");
        }

        scanner.close();

    }
}
