package basics.methods;

import java.util.ArrayList;

// Exercise 07
// Write a Java method to display the first 50 pentagonal numbers.

public class PentagonalNum {

    public static void main(String[] args) {
        // Create an ArrayList to store the pentagonal numbers
        ArrayList<Integer> pentagonalNumbers = new ArrayList<>();

        // Loop to calculate and store the first 50 pentagonal numbers
        for (int n = 1; n<= 50; n++) {
            int pentagonal = (3 * n * n - n) / 2;
            pentagonalNumbers.add(pentagonal);
         }

        // Print the pentagonal numbers
        System.out.println("First 50 Pentagonal Numbers: ");
        for (int number : pentagonalNumbers) {
            System.out.println(number);
        }
    }

}
