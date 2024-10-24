package basics.methods;

import java.util.Scanner;

// Exercise 02 - Exercício 02
// Write a Java method to compute the average of three numbers.

public class AverageNumber {

    // Method to find the average number among three numbers
    public static float findAverage(float num1, float num2, float num3) {
        // Calculate the average number
        return (num1 + num2 + num3) / 3;
    }

    // Main method - entry point for the program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input the first number: ");
        int num1 = input.nextInt();

        // Second input
        System.out.println("Input the second number: ");
        int num2 = input.nextInt();

        // Third input
        System.out.println("Input the third number: ");
        int num3 = input.nextInt();

        // Find the average and print the result
        float average = findAverage(num1, num2, num3);
        System.out.println("The average number is: " + average);

        // Close the scanner
        input.close();
    }
}
