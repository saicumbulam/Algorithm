package HashTable.Freqency;

import java.util.Collections;
import java.util.HashMap;

public class DegreeArray {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> right = new HashMap<>();
        HashMap<Integer, Integer> left = new HashMap<>();
        HashMap<Integer, Integer> count = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            if(left.get(nums[i]) == null) left.put(nums[i], i);
            right.put(nums[i], i);
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }

        int degree = Collections.max(count.values());
        int ans = nums.length;
        for(int x: count.keySet())
        {
            if(count.get(x) == degree)
            {
                ans = Math.min(ans, right.get(x) - left.get(x) + 1);
            }
        }

        return ans;
    }
}
