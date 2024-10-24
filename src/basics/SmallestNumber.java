package basics;

import java.util.Scanner;

// Exercise 01 - Exercício 01
// Write a Java method to find the smallest number among three numbers.

public class SmallestNumber {

    // Method to find the smallest number among three numbers.
    public static int findSmallest(int num1, int num2, int num3) {
        // Calculate the smallest number
        return Math.min(num1, Math.min(num2, num3));
    }

    // Main method - entry point for the program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // First input
        System.out.println("Input the first number: ");
        int num1 = input.nextInt();

        // Second input
        System.out.println("Input the second number: ");
        int num2 = input.nextInt();

        // Third input
        System.out.println("Input the third number: ");
        int num3 = input.nextInt();

        // Find the smallest number and print the result
        int smallest = findSmallest(num1, num2, num3);
        System.out.println("The smallest number is: " + smallest);

        // Close the scanner
        input.close();
    }
}
