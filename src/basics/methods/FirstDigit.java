package basics.methods;

import java.util.Scanner;

// Exercise 18
// Write a Java method for extracting the first digit from a positive or negative integer.

public class FirstDigit {
    // Method to find the first char in a string of numbers
    public static char firstDigit(String num) {
        // If the string starts with '-', return the second char
        if (num.charAt(0) == '-') {
            return num.charAt(1);
        }
        // If not, return the first char
        return num.charAt(0);
    }

    // Main method - entry point for the program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Get the user's input
        System.out.println("Input an integer (positive/negative): ");
        String num = input.nextLine();

        // Print the first number/char
        System.out.println(firstDigit(num));

        // Close input
        input.close();
    }
}
