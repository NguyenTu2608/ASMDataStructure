package ADT;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
public class QueueADT {

    public Queue<String> createQueue()
    {
        Queue<String> animals = new ArrayDeque<>();
        Queue<String> countries = new PriorityQueue<>();
        Queue<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("green");
        colors.add("pink");
        colors.add("violet");
        return colors;
    }
    public void showQueue(Queue<String> myQueue)
    {
        System.out.println("Queue is : " + myQueue);
    }
    public void insertDataQueue(Queue<String> queue)
    {
        queue.offer("black");
        queue.offer("white");
        queue.offer("yellow");
        queue.offer("brown");
    }

    public void checkSizeQueue(Queue<String> queue)
    {
        int size = queue.size(); //kick thuoc cua queue
        System.out.println("Size of queue is " + size);
    }

    public void getElementQueue(Queue<String> queue)
    {
        String Element = queue.element();
        System.out.println("Data element : " + Element);
    }

    public void getElementQueueV2(Queue<String> queue)
    {
        String data = queue.peek();
        System.out.println("ELement of peeked: " + data);
        System.out.println("Queue after peeked :" + queue);
    }


    public void removeElement(Queue<String> queue)
    {
        if(queue.isEmpty())
        {
            System.out.println("Queue is empty , so do not remove");
        }
        else {
            String data = queue.remove();
            System.out.println("Element removed " + data);
            System.out.println("Queue after removed: " + queue);
        }
    }


    public void isEmptyQueue(Queue<String> queue)
    {
        boolean isEmpty = queue.isEmpty();
        if (isEmpty)
        {
            System.out.println("Queue is Empty");
        }
        else
        {
            System.out.println("Queue is not Empty");
        }
    }

//    public boolean isFullQueue(Queue<String> queue)
//    {
//        return queue.size() >= maxSizeQueue;
//    }


    public void removeElementV2(Queue<String> queue)
    {
        String data2 = queue.poll();
        //neu queue rong k co phan tu nao de xoa thi tra ve null
        System.out.println("Element : " + queue);
    }

    public void loopElement(Queue<String> queue)
    {
        for (String item : queue)
        {
            System.out.println("Data item = " + item);
        }
    }



}
