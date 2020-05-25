package codingDrills.array.missingNumber_268;

import java.util.Arrays;
/*
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

Example 1:

Input: [3,0,1]
Output: 2
Example 2:

Input: [9,6,4,2,3,5,7,0,1]
Output: 8
Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 */

public class Solution {
    public int missingNumber(int[] nums){
        int expectedSum = nums.length * (nums.length + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
/* not optimal
    public int missingNumber(int[] nums){
        Arrays.sort(nums);

        if (nums[nums.length-1] != nums.length) {
            return nums.length;
        }

        else if (nums[0] != 0) {
            return 0;
        }


        for (int i = 0; i < nums.length; i++) {
            if (nums[i + 1] - nums[i] != 1){
                return nums[i] + 1;
            }
        }
        return -1;
    }

 */
}
