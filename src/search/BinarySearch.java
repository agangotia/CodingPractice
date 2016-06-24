package search;

/**
 * Created by anupam on 6/23/16.
 */
public class BinarySearch {

    public static int search(int[] data, int low, int high, int key) {
        if (low==high) {
            if (key==data[low])
                return low;
            return -1;
        }
        else {
            int mid = low + (high-low)/2;
            if (key==data[mid])
                return mid;
            else if (key<data[mid])
                return search(data, low, mid-1, key);
            else
                return search(data, mid+1, high, key);
        }

    }

    public static void main (String[] args) {
        int[] data = {1,4,8,19};
        System.out.println("finding"+search(data,0,3,19));

    }
}
