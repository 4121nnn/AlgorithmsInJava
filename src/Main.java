import sort.*;

import java.util.Arrays;

import sort.SortUtils.*;

public class Main {
    public static void main(String[] args) {
            long startTime = System.nanoTime();

            BubbleSort bubble = new BubbleSort();
            SelectionSort selection = new SelectionSort();
            QuickSort quick = new QuickSort();

            //Integer[] arr = new Integer[]{4,5,3,7,2,9,1,0,8};
            Integer[] arr = SortUtils.generateIntArray(100000);
            quick.sort(arr);
            //System.out.println(Arrays.toString(arr));
            //System.out.println(TestSort.isSorted(arr));

        long time = (System.nanoTime() - startTime) / 1000000;
        System.out.println(time + " ms");

    }
}