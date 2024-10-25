package basics.methods;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Exercise 14
// Write a Java method to display the current date and time.

public class DateTime {
    // Method to get and format the current date and time
    public static String dateTime() {
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EE MMMM dd HH:mm:ss");
        return currentTime.format(formatter);
    }

    // Main method - entry point for the program
    public static void main(String[] args) {
        System.out.println(dateTime());
    }
}
