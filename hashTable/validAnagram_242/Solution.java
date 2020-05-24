package codingDrills.hashTable.validAnagram_242;

import java.util.HashMap;
import java.util.Map;
/*
Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false

 */
public class Solution {
    public boolean isAnagram(String s, String t){
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : t.toCharArray()){
            count[c - 'a']--;
        }

        for (int x : count){
            if (x != 0) {
                return false;
            }
        }
        return true;
    }
/* Not optional solution
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();

        for (int i = 0; i < sa.length; i++) {
            map.put(sa[i], map.getOrDefault(sa[i], 0) + 1);
            map.put(ta[i], map.getOrDefault(ta[i], 0) - 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue() != 0) {
                return false;
            }
        }
        return true;
    }

 */
}
