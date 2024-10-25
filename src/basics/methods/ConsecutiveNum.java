package basics.methods;

import java.util.Scanner;

// Exercise 17
// Write a Java method that accepts three integers and checks whether they are consecutive or not.
// Returns true or false.

public class ConsecutiveNum {

    // Method to check if three numbers are consecutive or not
    public static boolean checkConsecutive(int a, int b, int c) {
        if (a + 1 != b) {
            return false;
        }
        return b + 1 == c;
    }

    // Main method - entry point for the program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get numbers a, b and c from user
        System.out.println("Input the first number: ");
        int a = input.nextInt();
        System.out.println("Input the second number: ");
        int b = input.nextInt();
        System.out.println("Input the third number: ");
        int c = input.nextInt();

        // Print result to the user
        System.out.println("Check whether the three said numbers are consecutive or not: " + checkConsecutive(a, b, c));

        // Close input
        input.close();
    }
}
