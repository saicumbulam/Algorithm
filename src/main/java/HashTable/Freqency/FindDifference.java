package HashTable.Freqency;

import java.util.HashMap;

public class FindDifference {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char ch: s.toCharArray())
        {
            hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray())
        {
            if (!hashMap.containsKey(ch))
            {
                return ch;
            }
            else
            {
                hashMap.put(ch, hashMap.get(ch) - 1);
                if (hashMap.get(ch) == 0)
                {
                    hashMap.remove(ch);
                }
            }
        }
        return ' ';
    }
}
