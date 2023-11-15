package sort;

public class TestSort {
    public static <T extends Comparable<T>> boolean isSorted(T[] arr){
        for(int i = 1; i < arr.length; i++){
            if(arr[i].compareTo(arr[i-1]) < 0) return false;
        }
        return true;
    }
}
