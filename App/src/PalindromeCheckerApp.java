import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {
    // Service class that handles palindrome logic
    static class PalindromeChecker {

        // Method to check palindrome
        public boolean checkPalindrome(String input) {

            if (input == null) {
                return false;
            }

            int start = 0;
            int end = input.length() - 1;

            while (start < end) {
                if (input.charAt(start) != input.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }

            return true;
        }
    }

    // Application class
       public static void main(String[] args){

           System.out.println("UC11: Object-Oriented Palindrome Service");

           Scanner scanner = new Scanner(System.in);

           System.out.print("Enter a string: ");
           String input = scanner.nextLine();

           // Create object of PalindromeChecker
           PalindromeChecker checker = new PalindromeChecker();

           boolean result = checker.checkPalindrome(input);

           if (result) {
               System.out.println(input + " is a Palindrome.");
           } else {
               System.out.println(input + " is NOT a Palindrome.");
           }

           System.out.println("Program ended.");
           scanner.close();



    }
}
