package codingDrills.string.firstUniqueCharacterInAString_387;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String s1 = "leetcode";
        String s2 = "loveleetcode";

        System.out.println("Index of first unique character in leetcode is " + s.firstUniqChar(s1));
        System.out.println("Index of first unique character in loveleetcode is " + s.firstUniqChar(s2));

    }
}
