import sort.BubbleSort;

import java.util.Arrays;

import sort.QuickSort;
import sort.SortUtils;
import sort.SortUtils.*;
import sort.TestSort;

public class Main {
    public static void main(String[] args) {
            long startTime = System.nanoTime();

            BubbleSort bubble = new BubbleSort();
            QuickSort quick = new QuickSort();
            //Integer[] arr = new Integer[]{4,5,3,7,2,9,1,0,8};
            Integer[] arr = SortUtils.generateIntArray(10000);
            quick.sort(arr);
            //System.out.println(Arrays.toString(arr));
        //System.out.println(TestSort.isSorted(arr));

        long time = (System.nanoTime() - startTime) / 1000000;
        System.out.println(time + " ms");

    }
}