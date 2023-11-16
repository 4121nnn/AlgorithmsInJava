import sort.BubbleSort;

import java.util.Arrays;

import sort.SortUtils;
import sort.SortUtils.*;

public class Main {
    public static void main(String[] args) {

            BubbleSort bubble = new BubbleSort();
            Integer[] arr = SortUtils.generateIntArray(10);
        System.out.println(Arrays.toString(bubble.sort(arr)));


    }
}