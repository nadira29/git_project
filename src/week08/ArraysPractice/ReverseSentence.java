package week08.ArraysPractice;

public class ReverseSentence {
    public static void main(String[] args) {
        System.out.println(reverseWords("java is fun")); // "fun is java"
        System.out.println(reverseWords("hello world")); // "world hello"
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" "); // Split the sentence into words
        String reversed = ""; // Initialize the reversed sentence

        for (int i = words.length - 1; i >= 0; i--) { // Reverse the words
            reversed += words[i] + " "; // Add the word to the reversed sentence
        }

        return reversed.trim(); // Remove trailing spaces
    }

}
