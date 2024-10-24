package basics.methods;

import java.util.Scanner;

// Exercise 03 -
// Write a Java method to compute the sum of digits in an integer.

public class SumDigits {

    // Method to find the sum of digits in an integer
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10; // Extract the last digit and add it to the sum
            num /= 10; // Remove last digit
        }
        return sum;
    }

    // Main method - entry point for the program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Get input from user
        System.out.println("Input an integer: ");
        int num = input.nextInt();
        // Use method to find the sum and print the result.
        System.out.println("The sum is " + sumOfDigits(num));

        // Close the scanner
        input.close();
    }
}
