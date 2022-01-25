package twoPointers.TwoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSumIIIDatastructure {
    private final HashMap<Integer, Integer> num_counts;

    /** Initialize your data structure here. */
    public TwoSumIIIDatastructure() {
        this.num_counts = new HashMap<Integer, Integer>();
    }

    /** Add the number to an internal data structure.. */
    public void add(int number) {
        num_counts.put(number, num_counts.getOrDefault(number, 0) + 1);
    }

    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
        for (Map.Entry<Integer, Integer> entry : this.num_counts.entrySet()) {
            int complement = value - entry.getKey();
            if (complement != entry.getKey())
            {
                if (this.num_counts.containsKey(complement)) return true;
            } else {
                if (entry.getValue() > 1) return true;
            }
        }
        return false;
    }
}
