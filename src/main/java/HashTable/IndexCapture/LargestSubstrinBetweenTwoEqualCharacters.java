package HashTable.IndexCapture;

import java.util.HashMap;

public class LargestSubstrinBetweenTwoEqualCharacters {
    public int maxLengthBetweenEqualCharacters(String s) {
        int res = -1;
        char[] ch = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0 ; i<s.length(); i++) {
            if (map.containsKey(ch[i])) {
                res = Math.max(res, i - 1 - map.get(ch[i]));
            } else {
                map.put(ch[i], i);
            }
        }
        return res;
    }
}
