package HashTable.KeyValue;

import java.util.HashMap;
import java.util.Map;

public class KthDistinctStringArray {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Boolean> hash = new HashMap<>();
        for(String str : arr) {
            if(!hash.containsKey(str))
                hash.put(str, true);
            else
                hash.put(str, false);
        }

        int cntDistinct = 0;

        for(int i = 0; i < arr.length; i += 1) {
            if(hash.get(arr[i])) cntDistinct += 1;
            if(cntDistinct == k) return arr[i];
        }

        return "";
    }
}
