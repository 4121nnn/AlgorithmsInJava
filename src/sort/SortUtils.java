package sort;
import java.util.Arrays;
import java.util.Random;

public final class SortUtils {

    public static <T> void swap(T[] arr, int i , int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static Integer[] generateIntArray(int length){

        Integer[] arr = new Integer[length];

        Random random = new Random();

        for(int i = 0 ; i < length; i++){
            int number = random.nextInt(100);
            arr[i] = number;
        }


        return arr;
    }
}
