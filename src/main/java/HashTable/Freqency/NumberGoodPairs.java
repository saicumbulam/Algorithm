package HashTable.Freqency;

import java.util.HashMap;

public class NumberGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for(int item: nums)
        {
            if(map.containsKey(item))
            {
                sum += map.get(item);
                map.put(item, map.get(item) + 1);
            }
            else
            {
                map.put(item, 1);
            }

        }

        return sum;
    }
}
