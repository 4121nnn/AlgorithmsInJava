package search;

public class BinarySearch {
    public static int search(int[] arr, int target){
        int left = 0, right = arr.length-1;
        while(left <= right){
            int mid = ( right + left ) >>> 1;
            if(arr[mid] < target){
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            }else{
                return mid;
            }
        }

        return -(left+1);
    }

}
