package HashTable.Freqency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonWordsTwoSentences {
    public String[] uncommonFromSentences(String A, String B) {
        String[] split1 = A.split(" ");
        String[] split2 = B.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < split1.length; i++)
        {
            map.put(split1[i], map.getOrDefault(split1[i], 0) + 1);
        }

        for (int i = 0; i < split2.length; i++)
        {
            map.put(split2[i], map.getOrDefault(split2[i], 0) + 1);
        }


        List<String> result = new ArrayList<>();
        for(Map.Entry<String, Integer> entry: map.entrySet())
        {
            if (entry.getValue() == 1)
            {
                result.add(entry.getKey());
            }
        }

        return result.toArray(new String[0]);
    }
}
