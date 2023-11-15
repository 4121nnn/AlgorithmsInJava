package sort;
import sort.SortUtils.*;

import static sort.SortUtils.*;

public class SelectionSort implements Sort{
    @Override
    public <T extends Comparable<T>> T[] sort(T[] arr){
        int n = arr.length;
        for(int i = 0; i < n ; i++){
            int minIndex = i;
            for(int j = i+1; j < n ; j++){
                if(arr[j].compareTo(arr[minIndex]) < 0){
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);

        }
        return arr;
    }
}
