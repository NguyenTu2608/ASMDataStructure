package ADT;

import java.util.*;
//Queue<Integer> animals2 = new LinkedList<>();
//Deque<String> animals3 = new LinkedList<>();
//LinkedList<String> animals4 = new LinkedList<>();
//animals.add("Lion");
//animals.add("Tiger");;
//animals.add("Monkey");
//animals.add("Dog");
//animals.add("Cat");

public class LinkedListADT {
    public void myLinkedList(){
        LinkedList<Integer> numbers = new LinkedList<>();
        List<Integer> numbersV1 = new LinkedList<>();
        Queue<Integer> numbersV2 = new LinkedList<>();
        Deque<Integer> numberV3 = new LinkedList<>();
    }

    public List<String> createLinkedList()
    {
        List<String> animals = new LinkedList<>();

        return animals;
    }

    public void addElement(List<String> animals)
    {
        animals.add("Lion");
        animals.add("Tiger");;
        animals.add("Monkey");
        animals.add("Dog");
        animals.add("Cat");
        System.out.println("Linked List : " + animals);
    }

    public void addElementByIndex(List<String> animals, int index, String value)
    {
        animals.add(index,value);
        System.out.println("Linked List after add data : " + animals);

    }

    public void getElementByIndex(List<String> animals, int index)
    {
        String value = animals.get(index);
        System.out.println("Gia tri cua phan tu o vi tri " + index + " la : " + value);
    }



    public void changeDataElement(List<String> animals, int index, String data)
    {
        animals.set(index,data);
        System.out.println("Linked List after updated : "+ animals);
    }


    public void removeDataElement(List<String> animals, int index)
    {
        animals.remove(index);
        System.out.println("Linked List after removed : " + animals);
    }

    public void reverseList(List<String> animals) {
        Collections.reverse(animals);
        System.out.println("Linked List after reversal : " + animals);
    }


    //
    public void findElement(List<String> animals, String data)
    {
        boolean checking = animals.contains(data);
        if (checking)
        {
            System.out.println(data + " found ");
        }
        else
        {
            System.out.println(data + " not found ");
        }
    }


    //Tim bat dau tu dau
    public void findElementV1(List<String> animals, String data)
    {
        int position = animals.indexOf(data);
        if (position == -1)
        {
            System.out.println(data + " Not found ");
        }
        else
        {
            System.out.println(data + " Found " + position);
        }
    }


    //Tim tu cuoi len dau khong thay doi index
    public void findElementV2(List<String> animals, String data)
    {
        int position = animals.lastIndexOf(data);
        if (position == -1)
        {
            System.out.println(data + " Not found ");
        }
        else
        {
            System.out.println(data + " Found " + position);
        }
    }



    public void loopElement(List<String> animals)
    {
        int size = animals.size();
        for(int i = 0; i < size; i++)
        {
            System.out.println("Value of element is : " + animals.get(i));
        }
    }
}
