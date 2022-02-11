package HashTable.IsoMorphic;

import java.util.HashMap;

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> mapPattern = new HashMap<>();
        HashMap<String, Character> mapS = new HashMap<>();

        String[] sArray = s.split(" ");
        if (sArray.length != pattern.length()) return false;

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String str = sArray[i];

            // Case 1: No mapping exists in either of the dictionaries
            if (!mapPattern.containsKey(c) && !mapS.containsKey(str)) {
                mapPattern.put(c, str);
                mapS.put(str,c);
            }

            if (!mapPattern.containsKey(c) || !mapS.containsKey(str)) return false;


            // it doesn't match in either of the dictionaries or both
            if (!(mapPattern.get(c).equals(str) && mapS.get(str) == c)) {
                return false;
            }
        }

        return true;
    }}
