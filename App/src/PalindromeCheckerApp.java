import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {
    interface PalindromeStrategy {
        boolean check(String input);
    }

    // Stack Strategy Implementation
    static class StackStrategy implements PalindromeStrategy {

        @Override
        public boolean check(String input) {

            Stack<Character> stack = new Stack<>();

            for (char ch : input.toCharArray()) {
                stack.push(ch);
            }

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) != stack.pop()) {
                    return false;
                }
            }

            return true;
        }
    }

    // Deque Strategy Implementation
    static class DequeStrategy implements PalindromeStrategy {

        @Override
        public boolean check(String input) {

            Deque<Character> deque = new ArrayDeque<>();

            for (char ch : input.toCharArray()) {
                deque.addLast(ch);
            }

            while (deque.size() > 1) {
                if (deque.removeFirst() != deque.removeLast()) {
                    return false;
                }
            }

            return true;
        }
    }

    // Context Class
    static class PalindromeContext {

        private PalindromeStrategy strategy;

        public PalindromeContext(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        public boolean execute(String input) {
            return strategy.check(input);
        }
    }

    public static void main(String[] args){


        System.out.println("UC12: Strategy Pattern for Palindrome Algorithms");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Choose Strategy:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");

        int choice = scanner.nextInt();

        PalindromeStrategy strategy;

        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        PalindromeContext context = new PalindromeContext(strategy);

        boolean result = context.execute(input);

        if (result) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }

        System.out.println("Program ended.");
        scanner.close();


    }
}
