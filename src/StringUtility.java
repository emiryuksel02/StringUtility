/**
 * This class contains several methods for strings.
 * 
 * @author Emir Yuksel
 * @version 1.0
 */
public final class StringUtility {

    private StringUtility() {

    }

    private static final int CHARACTER_RANGE = 256; // Number of characters in ASCII.

    /**
     * Reverses the given word.
     * 
     * @param word String to be reversed
     * @return reversedWord reversed string
     */

    public static String reverse(String word) {
        char[] wordChars = word.toCharArray();
        String[] reversedChars = new String[wordChars.length];
        int k = 0;

        for (int i = wordChars.length - 1; i >= 0; i--) {
            reversedChars[k] = String.valueOf(wordChars[i]);
            k++;
        }
        String reversedWord = String.join("", reversedChars);
        return reversedWord;
    }

    /**
     * Checks if the given word is a palindrome.
     * 
     * @param word input string
     * 
     * @return isPalindrome true if word is palindrome, false otherwise
     */

    public static boolean isPalindrome(String word) {
        String reversedWord = reverse(word);

        boolean isPalindrome = reversedWord.equals(word);

        return isPalindrome;

    }

    /**
     * Removes the character at the given index and returns the new string.
     * 
     * @param word input string
     * @param index index to remove
     * @return newWord string to return without the character at the specified index
     */

    public static String removeCharacter(String word, int index) {
        char[] wordChars = word.toCharArray();
        String[] newChars = new String[wordChars.length - 1];
        int k = 0;
        for (int i = 0; i < wordChars.length; i++) {
            if (i != index) {
                newChars[k] = String.valueOf(wordChars[i]);
                k++;
            }
        }
        String newWord = String.join("", newChars);
        return newWord;
    }

    /**
     * Checks if the given words are anagram.
     * 
     * <p>
     * If their lengths are not same, they are not anagram. If their lengths are
     * same, it counts the occurrence of each in both strings. Since ASCII has 256
     * different characters, we use character range as 256.
     * 
     * @param word1 input string to check
     * @param word2 input string to check
     * @return isAnagram true if they are anagram, false otherwise.
     */

    public static boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        int[] count = new int[CHARACTER_RANGE];
        for (int i = 0; i < word1.length(); i++) {
            count[word1.charAt(i)]++;
            count[word2.charAt(i)]--;

        }

        for (int i = 0; i < CHARACTER_RANGE; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;

    }

    /**
     * Capitalizes the first character of a string.
     * 
     * @param word input string
     * @return capitalizedWord capitalized string 
     */

    public static String capitalize(String word) {

        char[] wordChars = word.toCharArray();
        String[] capitalizedWordChars = new String[wordChars.length];
        capitalizedWordChars[0] = String.valueOf(wordChars[0]).toUpperCase();
        for (int i = 1; i < wordChars.length; i++) {
            capitalizedWordChars[i] = String.valueOf(wordChars[i]);
        }
        String capitalizedWord = String.join("", capitalizedWordChars);
        return capitalizedWord;
    }

    /**
     * Counts occurence of the wanted character.
     * 
     * @param word input string
     * @param character character to count occurence
     * @return count occurence of the wanted character
     */
    public static int countCharacter(String word, char character) {
        int count = 0;
        char[] wordChars = word.toCharArray();
        for (int i = 0; i < wordChars.length; i++) {
            if (wordChars[i] == character) {
                count++;
            }
        }
        return count;
    }

}
