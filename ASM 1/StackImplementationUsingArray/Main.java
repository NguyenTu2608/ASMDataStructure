package StackImplementationUsingArray;

public class Main {
    public static void main(String[] args) {
        StackArray stack = new StackArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element: " + stack.peek());  // Should print 30
        stack.pop();
        System.out.println("Top element after pop: " + stack.peek());// Should print 20
        System.out.println("Element Empty is true or fale ? " + stack.isEmpty());
        System.out.println("Element full is true or false ? " + stack.isFull());
    }
}


