package QueueImplementationUsingArray;

import java.util.Queue;
import java.util.Stack;

public class QueueLinkedList {
    private Node front, rear;
    private int size;
    // Node class representing each element in the queue
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // Constructor to initialize an empty queue
    public QueueLinkedList() {
        front = null;
        rear = null;
        size = 0;
    }

    // Method to add an element to the queue
    public void enqueue(int element) {
        Node newNode = new Node(element);
        if (rear == null) { // If the queue is empty
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Enqueued " + element);
    }

    // Method to remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue");
            return -1;
        }
        int element = front.data;
        front = front.next;
        if (front == null) { // If the queue becomes empty after dequeuing
            rear = null;
        }
        size--;
        return element;
    }

    // Method to get the front element of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to peek");
            return -1;
        }
        return front.data;
    }



    public boolean isEmpty() {
        return size == 0;
    }

    // Method to get the size of the queue
    public int size() {
        return size;
    }

}
