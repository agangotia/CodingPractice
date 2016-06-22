package sorting;

import java.util.Arrays;

/**
 * Created by anupam on 6/21/16.
 */
public class QuickSort {
    public static void sort(int[] data,int low, int high) {
        if (data == null || data.length == 0)
            return;

        if (low >= high)
            return;

        // get mid element
        int mid = low + (high-low)/2;
        int pivot = data[mid];

        int i = low;
        int j = high;
        while( i <= j ) {
            while ( data[i] < pivot )
                i++;
            while ( data[j] > pivot )
                j--;

            if (i <= j) {
                //switch values
                int temp = data[j];
                data[j] = data[i];
                data[i] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            sort(data, low, j);
        if ( high > i)
            sort(data, i, high);

    }

    public static void main(String[] args) {
        int[] data = {5,2,7,3,9};
        System.out.println(Arrays.toString(data));
        QuickSort.sort(data,0,data.length-1);
        System.out.println(Arrays.toString(data));
    }
}
