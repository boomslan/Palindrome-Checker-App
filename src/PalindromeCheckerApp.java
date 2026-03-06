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
 *
 * - removeFirst()
 * - removeLast()
 *
 * This demonstrates how LinkedList supports
 * double-ended operations for symmetric validation.
 *
 * @author Developer
 * @version 8.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC8.
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