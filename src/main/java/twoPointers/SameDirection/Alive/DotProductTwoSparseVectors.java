package twoPointers.SameDirection.Alive;

import java.util.HashMap;
import java.util.Map;

public class DotProductTwoSparseVectors {
    HashMap<Integer, Integer> map;

    DotProductTwoSparseVectors(int[] nums) {
        map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            if (nums[i] != 0)
            {
                map.put(i, nums[i]);
            }
        }
    }

    // Return the dotProduct of two sparse vectors
    public int dotProduct(DotProductTwoSparseVectors vec) {
        if (vec.map.size() < map.size() )
        {
            return vec.dotProduct(this);
        }

        int sum = 0;
        for(Map.Entry<Integer,Integer> item: map.entrySet())
        {
            if (!vec.map.containsKey(item.getKey()))
            {
                continue;
            }
            sum += item.getValue() * vec.map.get(item.getKey());
        }
        return sum;
    }
}
