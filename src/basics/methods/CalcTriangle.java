package basics.methods;

import java.util.Scanner;

// Exercise 12
// Write a Java method to calculate triangle area.

public class CalcTriangle {

    // Method to calculate the triangle area
    public static double calcTriangleArea(double a, double b, double c) {
        // Calculate the semi-perimeter
        double s = (a + b + c) / 2;

        // Calculate the area
        return Math.sqrt(s * (s - a) * (s - b) * (s-c));
    }

    // Main method - entry point for the program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the triangle's 3 sides from the user
        System.out.println("Input Side-1: ");
        double a = input.nextDouble();
        System.out.println("Input Side-2: ");
        double b = input.nextDouble();
        System.out.println("Input Side-3: ");
        double c = input.nextDouble();

        // Print the result
        System.out.println("The area of the triangle is " + calcTriangleArea(a, b, c));

        // Close the scanner
        input.close();
    }
}
