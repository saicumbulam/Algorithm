package HashTable.Freqency;

import java.util.HashMap;

public class FindWordsFormedbyCharacters {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c: chars.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0 ) + 1);
        }

        int result = 0;

        for(String item: words)
        {
            HashMap<Character, Integer> copy = new HashMap<>(map);
            boolean comp = true;

            for(char c: item.toCharArray())
            {
                if (!copy.containsKey(c))
                {
                    comp = false;
                    break;
                }
                copy.put(c, copy.get(c) - 1);
                if (copy.get(c) == 0)
                {
                    copy.remove(c);
                }
            }

            if (comp) result += item.length();
        }

        return result;
    }
}
