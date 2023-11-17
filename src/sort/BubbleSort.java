package sort;


import static sort.SortUtils.*;

public class BubbleSort implements Sort {


    public <T extends Comparable<T>> T[] sort(T[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length-i; j++){
                if(arr[j-1].compareTo(arr[j]) > 0){
                    swap(arr, j-1, j);
                }
            }
        }
        return arr;
    }

}
