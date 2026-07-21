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

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void shiftZerosToBottom(Stack<Integer> stack) {
        Stack<Integer> nonZeros = new Stack<>();
        int zeroCount = 0;

        // Step 1: Separate zeros from non-zeros
        while (!stack.isEmpty()) {
            int current = stack.pop();
            if (current == 0) {
                zeroCount++;
            } else {
                nonZeros.push(current);
            }
        }

        // Step 2: Push zeros first (they will go to the bottom)
        for (int i = 0; i < zeroCount; i++) {
            stack.push(0);
        }

        // Step 3: Put non-zeros back to restore their original order
        while (!nonZeros.isEmpty()) {
            stack.push(nonZeros.pop());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> myStack = new Stack<>();

        System.out.println("Enter numbers one by one (type any letter or 'done' to stop):");

        // Read dynamic user input
        while (scanner.hasNextInt()) {
            myStack.push(scanner.nextInt());
        }

        System.out.println("\nOriginal Stack: " + myStack);

        shiftZerosToBottom(myStack);

        System.out.println("Zeros at Bottom: " + myStack);

        scanner.close();
    }
}




import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void findMissingNumbers(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("The stack is empty. No range to calculate.");
            return;
        }

        // Use a Set for O(1) lookups and find the min/max values
        HashSet<Integer> presentNumbers = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Read all elements from the stack without destroying it
        for (int num : stack) {
            presentNumbers.add(num);
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println("\n--- Results ---");
        System.out.println("Range detected: From " + min + " to " + max);
        System.out.print("Missing numbers: ");

        boolean hasMissing = false;
        // Check every number in the range from min to max
        for (int i = min; i <= max; i++) {
            if (!presentNumbers.contains(i)) {
                System.out.print(i + " ");
                hasMissing = true;
            }
        }

        if (!hasMissing) {
            System.out.print("None! All numbers in the range are present.");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> myStack = new Stack<>();

        System.out.println("Enter numbers for the stack (type any letter or 'done' to stop):");

        // Read dynamic user input
        while (scanner.hasNextInt()) {
            myStack.push(scanner.nextInt());
        }

        System.out.println("\nOriginal Stack: " + myStack);

        // Find and print the missing elements
        findMissingNumbers(myStack);

        scanner.close();
    }
}
