package SortingAlgorithm;
public class MergeSort {
    public void Sorting(int[] numbers, int p, int q, int r)
    // p : left ; q : middle ; r : right
    {
        int n1 = q - p + 1; //middle - left + 1
        int n2 = r - q; // right - middle
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1 ; i++)
        {
            left[i] = numbers[p+i];
        }
        for (int j = 0; j < n2 ; j++)
        {
            right[j] = numbers[q + 1 + j];
        }
        int i,j,k;
        i = 0; j = 0; k = p;
        while (i < n1 && j < n2 )
        {
            if(left[i] < right[j])
            {
                numbers[k] = left[i];
                i++;
            }
            else
            {
                numbers[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < n1 )
        {
            numbers[k] = left[i];
            i++;
            k++;
        }
        while (j < n2)
        {
            numbers[k] = right[j];
            j++;
            k++;
        }
    }
    public void Merge(int[] numbers, int left, int right )
    {
        if (left < right)
        {
            int middle = (left + right ) / 2;
            Merge(numbers,left,middle);
            Merge(numbers,middle+1,right);
            Sorting(numbers,left,middle,right);
        }
    }
    public void showArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
        System.out.println();
    }
}
