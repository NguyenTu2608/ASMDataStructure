package QueueImplementationUsingArray;

import QueueImplementationUsingLinkedList.QueueArray;

public class Main {
    public static void main(String[] args) {
        QueueArray queue = new QueueArray(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println("Front element is: " + queue.peek());

        System.out.println("Dequeue " + queue.dequeue());
        System.out.println("Dequeue " + queue.dequeue());

        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);

        System.out.println("Queue size is " + queue.size());

        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }
        System.out.println("Queue size is " + queue.size());
    }
}
