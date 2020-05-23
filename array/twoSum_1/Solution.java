package codingDrills.array.twoSum_1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            } else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /* Not optimal solution
        public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){

            int temp = target - nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                if (temp == nums[j]){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
*/
}

