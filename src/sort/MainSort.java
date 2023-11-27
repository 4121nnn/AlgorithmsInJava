package sort;

import sort.*;

import java.util.Arrays;

import sort.SortUtils.*;

public class MainSort {
    public static void main(String[] args) {

        //Integer[] arr = new Integer[]{4,5,3,7,2,9,1,0,8};
        Integer[] arr = SortUtils.generateIntArray(10000);
        Integer[] bubbleArr = Arrays.copyOfRange(arr,0, arr.length);
        Integer[] selectionArr = Arrays.copyOfRange(arr,0, arr.length);
        Integer[] quickArr = Arrays.copyOfRange(arr,0, arr.length);
        Integer[] mergeArr = Arrays.copyOfRange(arr,0, arr.length);



        long bubblTime = TestSort.timeToSort(bubbleArr, new BubbleSort());
        System.out.println("Bubble sort time " + bubblTime + " ms.");

        long selectionTime = TestSort.timeToSort(selectionArr, new SelectionSort());
        System.out.println("Selection sort time " + selectionTime + " ms.");

        long quickTime = TestSort.timeToSort(quickArr, new QuickSort());
        System.out.println("Quick sort time " + quickTime + " ms.");

        long mergeTime = TestSort.timeToSort(mergeArr, new MergeSort());
        System.out.println("Merger sort time " + mergeTime + " ms.");


        //System.out.println(Arrays.toString(arr));
        //System.out.println(TestSort.isSorted(arr));

    }
}