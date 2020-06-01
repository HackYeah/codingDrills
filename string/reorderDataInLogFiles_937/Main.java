package codingDrills.string.reorderDataInLogFiles_937;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] input = {"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};
        System.out.println("Reordered logs " + Arrays.toString(s.reorderLogFiles(input)));
    }
}
