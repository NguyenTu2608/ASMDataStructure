package QueueImplementationUsingLinkedList;

import QueueImplementationUsingArray.QueueLinkedList;

public class Main {
    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();

        queue.enqueue(10);
        queue.enqueue(11);
        queue.enqueue(12);
        queue.enqueue(13);

        System.out.println("Front element is: " + queue.peek());

        System.out.println("Dequeue : " +queue.dequeue());
        System.out.println("Dequeue : " +queue.dequeue());

        queue.enqueue(14);
        queue.enqueue(15);
        queue.enqueue(16);


        System.out.println("Queue size is " + queue.size());

        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }
        System.out.println("Queue size is " + queue.size());
    }
}
