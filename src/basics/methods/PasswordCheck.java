package basics.methods;

import java.util.Scanner;

// Exercise 10
// Write a Java method to check whether a string is a valid password.
// Password rules:
// A password must have at least ten characters.
// A password consists of only letters and digits.
// A password must contain at least two digits.

public class PasswordCheck {

    // Method to check if password follows the rules mentioned above
    public static boolean checkPassword(String password) {

        // Check if the password has at least ten characters
        if (password.length() < 10) {
            return false;
        }

        // Check if the password contains only letters and digits
        if (!password.matches("^[a-zA-Z0-9]+$")) {
            return false;
        }

        // Count the number of digits in the password
        int digitCounter = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCounter++;
            }
        }

        // Check if the password has at least two digits
        return digitCounter >= 2;
    }

    // Main method - entry point for the program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Print password rules to the user
        System.out.println("Password must meet the following criteria:");
        System.out.println("1. A password must have at least ten characters.");
        System.out.println("2. A password consists of only letters and digits.");
        System.out.println("3. A password must contain at least two digits.");

        // Get the user's password and check if it's valid
        System.out.print("Enter a password: ");
        String password = input.nextLine();
        boolean result = checkPassword(password);

        // Output the result
        if (result) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Invalid Password.");
        }

        input.close();
    }
}
