package basics.methods;

import java.util.Scanner;

// Exercise 16
// Write a Java method to count the number of digits in an integer with value 2.

public class CountDigits {

    // Method to count occurrences of the digit '2'
    public static int countDigitTwo(String num) {
        int count = 0;

        // Iterate through each character in the string
        for (int i = 0; i < num.length(); i++) {
            char currentChar = num.charAt(i);

            // Check if the current character is '2'
            if (currentChar == '2') {
                count++;
            }
        }
        return count; // Return the count of digit '2'
    }

    // Main method - entry point for the program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for input
        System.out.println("Input a number: ");
        String num = input.nextLine();

        // Print the count of digit '2'
        System.out.println(countDigitTwo(num));

        // Close scanner
        input.close();
    }
}
