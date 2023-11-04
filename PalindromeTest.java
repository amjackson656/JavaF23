import java.util.Scanner;

public class PalindromeTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Report whether the integer is a palindrome
        System.out.println(number + (isPalindrome(number) ? " is" : " is not") + " a palindrome.");
    }

    // Return the reversal of an integer, e.g., reverse(456) returns 654
    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return reverse;
    }

    // Return true if the number is a palindrome
    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
}
