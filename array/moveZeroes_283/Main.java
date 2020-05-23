package codingDrills.array.moveZeroes_283;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] array = {0, 1, 0, 3, 12};
        s.moveZeroes(array);
        System.out.println("Array with moved zeroes: " + Arrays.toString(array));
    }
}
