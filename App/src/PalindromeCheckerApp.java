import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {
       public static void main(String[] args){
           public static void main(String[] args) {

               System.out.println("UC10: Case-Insensitive & Space-Ignored Palindrome");

               Scanner scanner = new Scanner(System.in);

               System.out.print("Enter a string: ");
               String input = scanner.nextLine();

               // Normalize string:
               // Remove all non-alphanumeric characters and convert to lowercase
               String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

               int start = 0;
               int end = normalized.length() - 1;
               boolean isPalindrome = true;

               while (start < end) {

                   if (normalized.charAt(start) != normalized.charAt(end)) {
                       isPalindrome = false;
                       break;
                   }

                   start++;
                   end--;
               }

               if (isPalindrome) {
                   System.out.println(input + " is a Palindrome (ignoring case and spaces).");
               } else {
                   System.out.println(input + " is NOT a Palindrome.");
               }

               System.out.println("Program ended.");
               scanner.close();
           }

    }
}
