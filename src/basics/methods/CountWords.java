package basics.methods;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Exercise 05
// Write a Java method to count all the words in a string.


// This specific exercise taught me about different ways of counting words, before then my usual go-to was splitting
// a String and counting the length of an array. I've learned about using Regular Expressions and StringTokenizer, I'll
// talk about the benefits of each down below.

public class CountWords {
    // Regular expressions offer the most flexibility and control and help handle punctuation or special cases
    public static int countWordsRE(String input) {
        // Define a pattern that matches words
        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = pattern.matcher(input);

        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    // StringTokenizer is a simpler, more efficient approach without needing to split the strings into an array.
    public static int countWordsTk(String input) {
        StringTokenizer tokenizer = new StringTokenizer(input);
        return tokenizer.countTokens();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please type in your sentence: ");
        String sentence = input.nextLine();

        int wordCount = countWordsRE(sentence);
        System.out.println("Word count: " + wordCount);
    }
}
