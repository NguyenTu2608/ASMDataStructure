package StackImplementationUsingLinkedList;

public class Main {
    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Top element: " + stack.peek());  // Should print 40
        stack.pop();
        System.out.println("Top element after pop: " + stack.peek());  // Should print 30
        System.out.println("Element Empty is " + stack.isEmpty());
    }
}



