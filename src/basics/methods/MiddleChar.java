package basics.methods;

import java.util.Scanner;

// Exercise 03
// Write a Java method to display the middle character of a string.
// Note: a) If the length of the string is odd, there will be two middle characters.
// b) If the length of the string is even, there will be one middle character.

public class MiddleChar {

    // Method to find the middle character(s)
    public static String findMiddle(String word) {
        int length = word.length();
        int middle = length /2;

        if (length == 0) {
            return "No characters in the string";
        } else if (length % 2 == 0) {
            // Return two middle characters for even length strings
            return word.substring(middle -1, middle +1);
        } else {
            // Return one middle character for odd length of strings
            return word.substring(middle, middle +1);
        }

    }

    // Main method - entry point for the program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User's input
        System.out.println("Input the word: ");
        String word = input.nextLine();

        // Find the middle character and print the result
        System.out.println("The middle character(s) in the string: " + findMiddle(word));

        // Close the scanner
        input.close();
    }
}
