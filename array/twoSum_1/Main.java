package codingDrills.array.twoSum_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {2, 7, 11, 15};
        int[] result = s.twoSum(arr, 9);
        System.out.println(Arrays.toString(result));

    }
}