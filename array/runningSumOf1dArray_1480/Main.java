package codingDrills.array.runningSumOf1dArray_1480;

import java.util.Arrays;

public class Main {

    public static void main(String [] args) {
        Solution s = new Solution();

        int[] nums = {1, 2, 3, 4};

        int[] result = s.runningSum(nums);

        System.out.println("Running sum of initial array is " + Arrays.toString(result));
    }
}
