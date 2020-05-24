package codingDrills.hashTable.intersectionOfTwoArrays_350;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Solution s = new Solution();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        System.out.println("Intersection of 2 arrays: " + Arrays.toString(s.intersec(nums1, nums2)));

    }
}
