package codingDrills.array.majorityElement_169;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] input) {
        Map<Integer, Integer> occurences = new HashMap<>();

        for (int j : input) {
            if (occurences.containsKey(j)) {
                occurences.put(j, occurences.get(j) + 1);
            } else {
                occurences.put(j, 1);
            }

        }

        Map.Entry<Integer, Integer> majorityEntry = null;

        for (Map.Entry<Integer, Integer> entry : occurences.entrySet() ){

            if (majorityEntry == null ||
                    entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }
        return majorityEntry.getKey();
    }
}
