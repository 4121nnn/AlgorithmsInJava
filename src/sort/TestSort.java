package sort;

public class TestSort {
    public static <T extends Comparable<T>> boolean isSorted(T[] arr){
        for(int i = 1; i < arr.length; i++){
            if(arr[i].compareTo(arr[i-1]) < 0) return false;
        }
        return true;
    }

    public static<T extends Comparable<T>> long timeToSort(T[] arr, Sort doSort){
        long startTime = System.nanoTime();
        doSort.sort(arr);
        return (System.nanoTime() - startTime) / 1000000;
    }

}
