package basics.methods;

// Exercise 13
// Write a Java method to create a pentagon's area.


public class CalcPentagon {

    // Method to calculate the area of a pentagon
    public static double calculatePentagonArea(double side) {
        return (1.0 / 4) * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * side * side;
    }

    // Main method - entry point for the program
    public static void main(String[] args) {
        double side = 6.0; // Replace with any side length
        System.out.println("The area of the pentagon is: " + calculatePentagonArea(side));
    }
}
