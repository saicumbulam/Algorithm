package HashTable.KeyValue;

import java.util.HashMap;

public class VerifyingAlienDictionary {
    HashMap<Character, Integer> map;

    public boolean isAlienSorted(String[] words, String order) {
        map = new HashMap<>();

        for(int i = 0; i < order.length(); i++)
        {
            map.put(order.charAt(i), i);
        }

        for(int i = 1; i < words.length; i++)
        {
            boolean tmp = Bigger(words[i-1], words[i]);
            //System.out.println(tmp);
            if(tmp)
            {
                return false;
            }
        }

        return true;
    }


    private boolean Bigger(String str1, String str2)
    {
        int n = str1.length();
        int m = str2.length();

        for(int i = 0; i < Math.min(n, m); i++)
        {
            if(str1.charAt(i) != str2.charAt(i))
            {
                return map.get(str1.charAt(i)) > map.get(str2.charAt(i));
            }
        }

        return n > m;
    }
}
