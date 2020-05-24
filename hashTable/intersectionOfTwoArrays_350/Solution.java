package codingDrills.hashTable.intersectionOfTwoArrays_350;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/*
Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
 */
public class Solution {
    public int[] intersec(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] arr = new int[nums1.length];
        int idx = 0;

        for (int i = 0,j = 0;i < nums1.length&& j < nums2.length;){
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                arr[idx ++] = nums1[i];
                i++;
                j++;
            }
        }
        return Arrays.copyOf(arr, idx);
    }

    /* Not optimal solution
    public int[] intersec(int[] nums1, int[] nums2){
        List<Integer> result = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int key : nums1) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (int key : nums2) {
            if (map.containsKey(key) && map.put(key, map.get(key) - 1) > 0 ) {
                result.add(key);
            }
        }

        int[] output = new int[result.size()];

        for (int i = 0; i < result.size(); i++){
            output[i] = result.get(i);
        }

        return output;
    }

     */

}
