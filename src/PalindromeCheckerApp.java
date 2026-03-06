import java.util.LinkedList;

/**
 * =========================================================
 *  MAIN CLASS - UseCase8PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a LinkedList.
 *
 * Characters are added to the list and then compared
 * by removing elements from both ends:
 * ============================================================
 * MAIN CLASS – UseCase10PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 10: Normalized Palindrome Validation
 *
 * Description:
 * This class validates a palindrome after preprocessing
 * the input string.
 *
 * Normalization includes:
 * - Removing spaces and symbols
 * - Converting to lowercase
 *
 * This ensures the palindrome check is logical rather
 * than character-format dependent.
 *
 * This demonstrates how LinkedList supports
 * double-ended operations for symmetric validation.
 *
 * @author Developer
 * @version 8.0
 * Example:
 * "A man a plan a canal Panama"
 *
 * @author Developer
 * @version 1.0.0
 * MAIN CLASS – UseCase9RecursivePalindrome
 * ============================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using recursion.
 *
 * Characters are compared from the outer positions
 * moving inward using recursive calls.
 *
 * The recursion stops when:
 * - ALL characters are matched, or
 * - A mismatch is found.
 *
 * This use case demonstrates divide-and-conquer
 * logic using method recursion.
 *
 * @author Developer
 * @version 9.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC8.
     * Application entry point for UC10.
     * Application entry point for UC9.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String text = "racecar";

        LinkedList<Character> list = new LinkedList<>();
        for (char c : text.toCharArray()) {
            list.add(c);
        }

        int size = list.size();
        int mid = size / 2;

        LinkedList<Character> firstHalf = new LinkedList<>();
        LinkedList<Character> secondHalf = new LinkedList<>();

        for (int i = 0; i < mid; i++) {
            firstHalf.add(list.get(i));
        }

        int start = (size % 2 == 0) ? mid : mid + 1;
        for (int i = start; i < size; i++) {
            secondHalf.add(list.get(i));
        }

        LinkedList<Character> reversedSecond = new LinkedList<>();
        while (!secondHalf.isEmpty()) {
            reversedSecond.add(secondHalf.removeLast());
        }

        if (firstHalf.equals(reversedSecond)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
        String input = "A man a plan a canal Panama";

        String normalized = normalizeString(input);

        boolean isPalindrome = isPalindrome(normalized);

        System.out.println("Original: " + input);
        System.out.println("Normalized: " + normalized);
        System.out.println("Is Palindrome: " + isPalindrome);
    }

    public static String normalizeString(String str) {
        return str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
        String str = "madam";

        boolean result = check(str, 0, str.length() - 1);

        if (result) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }

    /**
     * Recursively checks whether a string is palindrome.
     *
     * @param s     Input string
     * @param start Starting index
     * @param end   Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return check(s, start + 1, end - 1);
    }
}
