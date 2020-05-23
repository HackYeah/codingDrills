package codingDrills.string.reverseString_344;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Solution s = new Solution();
        char[] originalString = {'h', 'e', 'l', 'l', 'o'};
        s.reverseString(originalString);
        System.out.println("Reversed string is " + Arrays.toString(originalString));

    }
}
