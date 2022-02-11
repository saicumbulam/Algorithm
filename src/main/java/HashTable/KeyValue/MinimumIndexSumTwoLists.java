package HashTable.KeyValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MinimumIndexSumTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < list1.length; i++)
        {
            map.put(list1[i], i);
        }

        int i1 = -1;
        int i2 = -1;
        int diff = Integer.MAX_VALUE;
        List<String> result = new ArrayList<>();

        for(int i = 0; i < list2.length; i++)
        {
            if(map.containsKey(list2[i]))
            {
                i1 = map.get(list2[i]);
                i2 = i;

                if (diff > i1 + i2)
                {
                    result.clear();
                    diff = i1 + i2;
                    result.add(list2[i]);
                }
                else if (diff == i1 + i2)
                {
                    result.add(list2[i]);
                }
            }
        }


        String[] arr = new String[result.size()];
        int index = 0;

        for(String item: result)
        {
            arr[index++] = item;
        }
        return arr;
    }
}
