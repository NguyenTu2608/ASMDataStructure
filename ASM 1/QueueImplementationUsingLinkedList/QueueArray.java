package QueueImplementationUsingLinkedList;

import java.util.Queue;

public class QueueArray {
    private int maxSizeQueue;
    private int[] Queue;
    private int size;
    private int front;
    private int rear;
    public QueueArray(int maxSizeQueue)
    {
        this.maxSizeQueue = maxSizeQueue;
        Queue = new int[maxSizeQueue];
        size = 0;
        front = 0;
        rear = -1;
    }
    public boolean isFull() {
        return size == maxSizeQueue;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public int size() {
        return size;
    }
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + element);
            return;
        }
        rear = (rear + 1) % maxSizeQueue;
        Queue[rear] = element;
        size++;
        System.out.println("Enqueued " + element);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue");
            return -1;
        }
        int element = Queue[front];
        front = (front + 1) % maxSizeQueue;
        size--;
        return element;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to peek");
            return -1;
        }
        return Queue[front];
    }
}
