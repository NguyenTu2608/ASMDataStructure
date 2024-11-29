package StackImplementationUsingArray;

public class StackArray {
    private int maxSize;  // maximum size of the stack
    private int[] stackArray;  // array representing the stack
    private int top;  // index of the top element in the stack

    // Constructor to initialize the stack
    public StackArray(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;  // stack is empty initially
    }

    // Push operation: adds an element to the top of the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push element.");
        } else {
            stackArray[++top] = value;  // increment top, then insert value
        }
    }

    // Pop operation: removes the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1;  // return an invalid value to indicate stack is empty
        } else {
            return stackArray[top--];  // return top element, then decrement top
        }
    }

    // Peek operation: returns the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;  // return an invalid value if stack is empty
        } else {
            return stackArray[top];
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }
}