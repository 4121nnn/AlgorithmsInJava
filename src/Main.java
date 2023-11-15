import sort.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

            BubbleSort bubble = new BubbleSort();
            Integer[] arr = new Integer[]{3,2,1,5,67,3,1};
        System.out.println(Arrays.toString(bubble.sort(arr)));


    }
}