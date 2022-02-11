package HashTable.Freqency;

import java.util.HashMap;

public class MakeTwoArraysEqualbyReversingSubarrays {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int item : target)
        {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        for (int item : arr)
        {
            if (!map.containsKey(item))
            {
                return false;
            }
            else
            {
                map.put(item, map.get(item) - 1);
                if (map.get(item) == 0)
                {
                    map.remove(item);
                }
            }
        }

        if (map.size() == 0)
        {
            return true;
        }
        return false;
    }
}
