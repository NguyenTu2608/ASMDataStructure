package SortingAlgorithm;

import java.util.Arrays;

public class BubbleSort {
    public void sorting(int[] numbers)
    {
        int sizeArray = numbers.length;
        for(int i = 0; i < sizeArray - 1 ; i++)
        {
            for (int j = 0; j < sizeArray - i - 1; j++)
            {
                if (numbers[j] > numbers[j+1])
                {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = tmp;
                }
            }
        }
    }
    public void printArray(int[] numbers)
    {
        for ( int item : numbers)
        {
            System.out.println(item);
        }
    }
}
