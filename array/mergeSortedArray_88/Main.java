package codingDrills.array.mergeSortedArray_88;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Solution s = new Solution();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        s.merge(nums1, m, nums2, n);
        System.out.println("Merged array: " + Arrays.toString(nums1));
    }
}
