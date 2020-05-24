package codingDrills.hashTable.validAnagram_242;

public class Main {
    public static void main(String[] args){
        Solution s = new Solution();
        String s1 = "anagram";
        String s2 = "nagaram";

        System.out.println("S2 is anagram of S1: " + s.isAnagram(s1, s2));
    }
}
