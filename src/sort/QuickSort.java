package sort;

import java.util.Arrays;

import static sort.SortUtils.swap;

public class QuickSort implements Sort{


    @Override
    public <T extends Comparable<T>> T[] sort(T[] arr) {
        int pivot = arr.length-1;
        sort1(arr, 0, pivot);
        return arr;
    }
     private <T extends Comparable<T>> void sort1(T[] arr, int start, int end){
        if( start >= end ) return;
        int i = start - 1;
        int pivot = (int) (start + Math.random() * (end - start + 1));
        swap(arr, pivot, end);
        for(int j = start; j < end; j++){
            if(arr[j].compareTo(arr[end]) <= 0){
                swap(arr, ++i, j);
            }
        }
        swap(arr, ++i, end);
        sort1(arr, start, i-1 );
        sort1(arr, i+1, end);
     }

}
