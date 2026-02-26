import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args){
        System.out.println("UC8: Linked List Based Palindrome Checker");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (input.length() == 0) {
            System.out.println("Empty string is a Palindrome.");
            return;
        }

        // Convert string to linked list
        Node head = new Node(input.charAt(0));
        Node current = head;

        for (int i = 1; i < input.length(); i++) {
            current.next = new Node(input.charAt(i));
            current = current.next;
        }

        // Find middle using Fast & Slow pointer
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node prev = null;
        Node next = null;
        Node secondHalf = slow;

        while (secondHalf != null) {
            next = secondHalf.next;
            secondHalf.next = prev;
            prev = secondHalf;
            secondHalf = next;
        }

        // Compare first half and reversed second half
        Node firstHalf = head;
        Node reversedHalf = prev;

        boolean isPalindrome = true;

        while (reversedHalf != null) {
            if (firstHalf.data != reversedHalf.data) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            reversedHalf = reversedHalf.next;
        }

        // Print result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }

        System.out.println("Program ended.");
        scanner.close();

    }
}
