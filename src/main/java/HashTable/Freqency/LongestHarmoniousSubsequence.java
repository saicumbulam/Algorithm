package HashTable.Freqency;

import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int maxLength = Integer.MIN_VALUE;

        for(Map.Entry<Integer, Integer> entry: map.entrySet())
        {
            if (map.containsKey(entry.getKey() + 1))
            {
                maxLength = Math.max(maxLength, map.get(entry.getKey()) + map.get(entry.getKey()+1));
            }
        }

        return maxLength == Integer.MIN_VALUE ? 0 : maxLength;
    }
}
