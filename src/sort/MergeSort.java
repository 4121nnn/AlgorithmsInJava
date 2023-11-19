package sort;

public class MergeSort implements Sort{

   @Override
    public <T extends Comparable<T>> T[] sort(T[] arr){
       int n = arr.length;

       return arr;
    }

    public <T extends Comparable<T>> void sort(T[] arr, int from, int to){
       if(to - from <= 1) return;
       sort(arr, from, to/2);
       sort(arr, to/2, to);

    }

}

