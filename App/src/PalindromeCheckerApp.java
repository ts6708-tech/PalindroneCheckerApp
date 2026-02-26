import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){

        System.out.println("UC3: Palindrome Check Using String Reverse");

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        // Variable to store reversed string
        String reversed = "";

        // Reverse using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed string
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }

        System.out.println("Program ended.");

        // Close scanner
        scanner.close();

    }
}
