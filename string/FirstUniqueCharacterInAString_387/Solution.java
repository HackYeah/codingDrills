package codingDrills.string.FirstUniqueCharacterInAString_387;

import java.util.HashMap;

public class Solution {
    public int firstUniqChar(String s){
        int result = s.length();

        for (char c = 'a'; c <= 'z'; c++){
            int index = s.indexOf(c);

            if (index != -1 && index == s.lastIndexOf(c)) {
                result = Math.min(result,index);
            }
        }
        return result == s.length()? -1: result;
    }
/*  Not optimal solution
    public int firstUniqChar(String s){
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int n = s.length();

        for (int i = 0; i < n; i++){
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < n; i++){
            if (count.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
*/
}
