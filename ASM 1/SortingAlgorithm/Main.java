package SortingAlgorithm;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        BubbleSort bubbleSort = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();
        SelectionSort selectionSort = new SelectionSort();
        MergeSort mergeSort = new MergeSort();

        int[] randomNumbers = {1,3,2,9,6,4,8,5};
        bubbleSort.sorting(randomNumbers);
        bubbleSort.printArray(randomNumbers);


        int[] randomNumbers1 = {1,3,2,9,6,4,8,5,10};
        insertionSort.sorting(randomNumbers1);
        insertionSort.showSorting(randomNumbers1);


//        int[] randomNumbers2 = {1,3,2,9,6,4,8,5,10};
//        selectionSort.Sorting(randomNumbers2);
//        selectionSort.showArray(randomNumbers2);

        int[] randomNumbers3 = {1,3,2,9,6,4,8,5,10};
        mergeSort.Merge(randomNumbers3,0,randomNumbers3.length -1);
        mergeSort.showArray(randomNumbers3);


        int[] data = { 8, 7, 2, 1, 0, 9, 6 };
        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(data));

        int size = data.length;

        // call quicksort() on array data
        QuickSort.quickSort(data, 0, size - 1);

        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));

    }
}
