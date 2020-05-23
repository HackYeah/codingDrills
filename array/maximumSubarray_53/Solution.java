package codingDrills.array.maximumSubarray_53;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null){
            return 0;
        }

        int result = Integer.MIN_VALUE;
        int sum = 0;

        for (int n : nums){
            if (sum < 0) {
                sum = n;
            } else {
                sum += n;
            }
            result = Math.max(result, sum);
        }
        return result;
    }

/*Not optional solution
      public int maxSubArray(int[] nums) {
        int max = nums[0];

        for (int j = 0; j < nums.length; j++){
            int sum = nums[j];

            if (max < nums[j]){
                max = nums[j];
            }

            for (int i = j+1; i < nums.length & j< nums.length; i++){
                sum += nums[i];

                if (max < sum){
                    max = sum;
                }
            }
        }
        return max;
    }
*/

/* Not optimal solution
    public int maxSubArray(int[] nums) {
        Map<int[], Integer> map = new HashMap<>();
        for (int j = 0; j < nums.length; j++){
            map.put(new int[] {nums[j]}, nums[j]);
            int sum = nums[j];

            for (int i = j+1; i < nums.length & j< nums.length; i++){
                sum += nums[i];
                map.put(Arrays.copyOfRange(nums,j,i+1), sum);
            }
        }

        int max = Collections.max(map.values());

        return max;

    }
*/
}


