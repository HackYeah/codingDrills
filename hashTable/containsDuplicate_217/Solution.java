package codingDrills.hashTable.containsDuplicate_217;

import java.util.Arrays;
import java.util.HashMap;
/*
Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

Example 1:

Input: [1,2,3,1]
Output: true
Example 2:

Input: [1,2,3,4]
Output: false
Example 3:

Input: [1,1,1,3,3,4,3,2,4,2]
Output: true
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i -1] == nums[i]) {
                return true;
            }
        }
        return false;
    }
/* Not optimal solution
    public boolean containsDuplicate(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (int n : nums){
            if (map.get(n) != 0) {
                return true;
            }
        }
        return false;
    }

 */
}
