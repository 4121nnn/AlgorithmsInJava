package search;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,3,4,6,7,8,9};
        int key = 9;
        System.out.println(Arrays.binarySearch(arr, key));
        System.out.println(BinarySearch.search(arr, key));



    }
}
