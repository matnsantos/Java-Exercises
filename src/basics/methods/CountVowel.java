package basics.methods;

import java.util.Scanner;

// Exercise 03 - Exercício 03
// Write a Java method to count all vowels in a string.

public class CountVowel {

    // Method to count the vowels in a specified word.
    public static int countVowels(String word) {
        // Define vowels as a string
        String vowels = "aeiouAEIOU"; // Including uppercase
        int count = 0; // Initialize count

        // Iterate through each character in the input word
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i); // Get the character at the current position

            // Check if currentChar is a vowel
            if (vowels.indexOf(currentChar) != -1) {
                count++; // Increment count if it is
            }
        }
        return count; // Return total count of vowels
    }

    // Main method - entry point for the program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask input from user
        System.out.println("Please type in your word to be counted: ");
        String toBeCounted = input.nextLine();

        // Print out the number of vowels
        System.out.println("The number of Vowels in the string: " + countVowels(toBeCounted));

        // Close scanner
        input.close();
    }
}