package week08.ArraysPractice;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        System.out.println(isAnagram("listen", "silent")); // true
        System.out.println(isAnagram("hello", "world")); // false
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        return Arrays.equals(char1, char2);
    }

    // toCharArray() turns each String into a char[].
    // After sorting, anagrams have identical char arrays.
    // so Arrays.equals() returns true.


}
