package ADT;

import java.util.List;
import java.util.Stack;


public class StackADT {
    private int maxSize;

    public StackADT(int maxSize) {
        this.maxSize = maxSize;
    }

    public Stack<String> createStack1()
    {
        Stack<String> numbers1 = new Stack<>();
        return numbers1;
    }

    public Stack<Integer> createStack()
    {
        Stack<Integer> numbers = new Stack<>();
        List<String> cars = new Stack<>();
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);
        numbers.push(4);
        numbers.push(5);
        return numbers;

    }
    public void displayStack(Stack<Integer> numbers)
    {
        System.out.println("Stack : " + numbers);
    }

    public void removeStack(Stack<Integer> numbers)
    {
        numbers.pop();
        System.out.println("Stack after removed " + numbers);
    }

    public void peekStack(Stack<Integer> numbers)
    {
        int num = numbers.peek();
        System.out.println("Stack is peeked " + num);
        System.out.println("Stack after peeked "+numbers);

    }

    public void countElement(Stack<Integer> numbers)
    {
        int count = numbers.size();
        System.out.println("Size of Stack : "+ count);
    }

    public void findElement(Stack<Integer> numbers,int number)
    {
        int checking = numbers.search(number);
        if (checking == -1) {
            System.out.println(number + " not found ");
        }
        else
        {
            System.out.println(number + " found at position " + checking);
        }
    }

    public void isEmpty(Stack<Integer> numbers)
    {
        if(numbers.empty())
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Stack is no empty");
        }
    }


    public void isEmpty1(Stack<Integer> numbers)
    {
        if(numbers.empty())
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Stack is no empty");
        }
    }

    public boolean isFull(Stack<Integer> numbers) {
        return numbers.size() >= maxSize;
    }


    public void loopElement(Stack<Integer> numbers)
    {
        int size = numbers.size();
        for (int i = 0; i < size; i++)
        {
            System.out.println("Value of element is " + numbers.get(i));
        }
    }
}
