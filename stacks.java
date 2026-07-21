import java.util.Stack;

public class Main {
    public static void deleteEvenNumbers(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.isEmpty()) {
            int current = stack.pop();
            if (current % 2 != 0) {
                tempStack.push(current);
            }
        }

        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
       for (int i = 1; i <= 50; i++) {
            myStack.push(i);
        }

        System.out.println("Original Stack: " + myStack);
        
        deleteEvenNumbers(myStack);
        
        System.out.println("Filtered Stack: " + myStack);
    }
}





import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void deleteEvenNumbers(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();

        // Step 1: Filter out even numbers
        while (!stack.isEmpty()) {
            int current = stack.pop();
            if (current % 2 != 0) {
                tempStack.push(current);
            }
        }

        // Step 2: Restore original order
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> myStack = new Stack<>();

        // Get the starting number
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        // Get the ending number
        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        // Populate the stack based on user input
        for (int i = start; i <= end; i++) {                                // u give a starting number, and an ending one, all the elements in range will just be pushed into the stack
            myStack.push(i);
        }

        System.out.println("\nOriginal Stack:\n" + myStack);
        
        deleteEvenNumbers(myStack);
        
        System.out.println("\nFiltered Stack (Only Odds):\n" + myStack);

        // Close the scanner resource
        scanner.close();
    }
}

