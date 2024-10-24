package basics.methods;

import java.util.Scanner;

// Exercise 8
// Write a Java method to compute the future investment value at a given interest rate for a specified number of years.

public class InvestmentValue {

    // Method to calculate investment over time
    public static void calcInvestment(float investment, float interestRate, int years) {
        float total = investment;

        // Loop for each year to calculate compound interest
        for (int i = 1; i <= years; i++) {
            total = total + (total * (interestRate / 100)); //
            System.out.println(i + "-" + total);
        }
    }

    // Main method - entry point for the program
    public static void main(String[] args) {
        // User input section for investment, interest rate and year
        Scanner input = new Scanner(System.in);

        System.out.println("Enter initial investment amount: ");
        float investment = input.nextFloat();

        System.out.println("Enter annual interest rate (in %): ");
        float interestRate = input.nextFloat();

        System.out.println("Enter the number of years: ");
        int years = input.nextInt();

        // Display the future value after each year
        System.out.println("years - Future Value");
        calcInvestment(investment, interestRate, years);

        input.close();
    }
}
