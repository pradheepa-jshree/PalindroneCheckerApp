
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // Step 1: Predefined (hardcoded) string
        String input = "madam";
        int length = input.length();
        boolean isPalindrome = true;

        // Step 2: Palindrome Logic using the hint
        // Loop only until half of the string length
        for (int i = 0; i < length / 2; i++) {
            // Compare character from start (i) with character from end (length - 1 - i)
            if (input.charAt(i) != input.charAt(length - 1 - i)) {
                isPalindrome = false;
                break; // Exit loop early if a mismatch is found
            }
        }

        // Step 3: Display the result
        System.out.println("Input String: " + input);
        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is not a palindrome.");
        }
    }
}