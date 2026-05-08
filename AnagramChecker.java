//An anagram is a word or a phrase made by transposing the letters of another word or phrase; for example, "parliament" is an anagram of "partial men," and "software" is an anagram of     "swear oft." Write a program that figures out whether one string is an anagram of another string. The program should ignore white space and punctuation.
import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        // Example input strings
        String str1 = "parliament";
        String str2 = "partial men";

        // Check if they are anagrams
        if (areAnagrams(str1, str2)) {
            System.out.println("The given strings are anagrams.");
        } else {
            System.out.println("The given strings are NOT anagrams.");
        }
    }

    // Function to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // Remove all non-alphabetic characters and convert to lowercase
        str1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        str2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Convert to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted character arrays
        return Arrays.equals(charArray1, charArray2);
    }
}
