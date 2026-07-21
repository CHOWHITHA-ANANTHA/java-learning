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
