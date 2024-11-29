package SortingAlgorithm;

public class InsertionSort {
    public void sorting(int[] numbers)
    {
        int sizeArray = numbers.length;
        for (int i = 0; i < sizeArray ; i++) // i la vi tri = 0
        {
            int key = numbers[i];
            int j = i - 1;

            while (j >= 0 && key < numbers[j])
            {
                numbers[j+1] = numbers[j];
                j--;
            }
            numbers[j+1] = key;
        }
    }

    public void showSorting(int[] numbers)
    {
        for(int i = 0; i < numbers.length;i++)
        {
            System.out.println("Key = " + i + " : item = " + numbers[i] );
        }
    }
}
