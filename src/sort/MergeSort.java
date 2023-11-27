package sort;

import java.util.Arrays;

public class MergeSort implements Sort{

    @Override
    public <T extends Comparable<T>> T[] sort(T[] arr) {
        int n = arr.length;
        if(n <= 1) return arr;

        T[] left  = Arrays.copyOfRange(arr,0, n/2);
        T[] right = Arrays.copyOfRange(arr,n/2, n);

        left  = sort(left);
        right = sort(right);

        merge(arr, left, right);

        return arr;
    }
    private <T extends Comparable<T>> void merge(T[] arr, T[] left, T[] right){
        int L = left.length, R = right.length;
        int i = 0, j = 0, k = 0;

        while(i < L && j < R){
            if(left[i].compareTo(right[j]) < 0){
                arr[k++] = left[i++];
            }else {
                arr[k++] = right[j++];
            }
        }
        while(i < L){
            arr[k++] = left[i++];
        }
        while(j < R){
            arr[k++] = right[j++];
        }
    }
}

