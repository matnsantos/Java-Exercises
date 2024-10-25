package basics.methods;

import java.util.Scanner;

// Exercise 09
// Write a Java method to check whether a year (integer) entered by the user is a leap year or not.


public class LeapYear {
    // Method to check whether a year is a leap year or not
    public static boolean isLeapYear(int year) {
        // First check: if the year is divisible by 400, it's a leap year
        if (year % 400 == 0) {
          return true;
        }
        // Second check: if the year is divisible by 100 but not by 400, it's not a leap year
        if (year % 100 == 0) {
            return false;
        }
        // Final check: If the year is divisible by 4 but not by 100, it's a leap year
        return year % 4 == 0;
        // Otherwise, it's not a leap year
    }

    // Main method - entry point for the program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Input a year: ");
        int year = input.nextInt();

        System.out.println(isLeapYear(year));
    }
}
