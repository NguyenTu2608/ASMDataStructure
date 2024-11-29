package SortingAlgorithm;

public class SelectionSort {
    public void Sorting(int[] numbers)
    {
        int size = numbers.length;
        for ( int i = 0 ; i < size ; i++)
        {
            int min = i; //gia su tim dc vi tri cua phan tu nho nhat
            for ( int j = i + 1 ; j < size ; j++)
            {
                if (numbers[j] < numbers[min])
                {
                    min = j;
                }
            }
            int tmp = numbers[i];
            numbers[i] = numbers[min];
            numbers[min] = tmp;
        }
    }
    public void showArray(int[] numbers)
    {
        for (int i : numbers)
        {
            System.out.println(i);
        }
    }
}
