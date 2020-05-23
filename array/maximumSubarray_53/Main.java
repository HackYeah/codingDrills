package codingDrills.array.maximumSubarray_53;

public class Main {
    public static void main (String[] args){
        int[] arr = {-2, -1, -3, -4, -1, -2, -1, -5, -4};
        Solution s = new Solution();
        int maxSubarraySum = s.maxSubArray(arr);
        System.out.println("Maximum subarray summ is " + maxSubarraySum);
    }
}
