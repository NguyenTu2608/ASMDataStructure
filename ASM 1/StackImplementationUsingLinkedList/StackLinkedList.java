package StackImplementationUsingLinkedList;

class StackLinkedList {
    private Node top;  // Top of the stack

    // Inner class to define the node structure
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Constructor to initialize the stack
    public StackLinkedList() {
        top = null;  // stack is empty initially
    }

    // Push operation: adds an element to the top of the stack
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;  // Link the new node to the current top
        top = newNode;  // Update the top to the new node
    }

    // Pop operation: removes the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1;  // return an invalid value to indicate stack is empty
        } else {
            int value = top.data;  // Get the data from the top node
            top = top.next;  // Move the top pointer to the next node
            return value;  // Return the popped value
        }
    }

    // Peek operation: returns the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;  // return an invalid value if stack is empty
        } else {
            return top.data;  // Return the data from the top node
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return (top == null);
    }
}
