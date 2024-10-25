package basics.methods;

// Exercise 15
// Write a Java method to find all twin prime numbers less than 100.

public class TwinPrimeNum {

    // Method to check if number is prime
    public static boolean isPrime(int num) {
        // If the number is less than 2, it's not prime
        if (num < 2) {
            return false;
        }
        // If the number is divisible by numbers between 2 and the square root of itself, then it's not prime
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
        }

    // Main method - entry point for the program
    public static void main(String[] args) {
        for (int i = 2; i <= 98; i++)
            if(isPrime(i) && isPrime(i+2)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
    }

}
