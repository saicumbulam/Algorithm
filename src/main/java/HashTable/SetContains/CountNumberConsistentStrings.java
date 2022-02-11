package HashTable.SetContains;

import java.util.HashSet;
import java.util.Set;

public class CountNumberConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        int consistent = 0;
        Set<Character> set = new HashSet<>(); // added Set to search in O(1)

        for(char letter : allowed.toCharArray())
        {
            set.add(letter);
        }

        for(String word : words)
        {
            for(int i = 0; i < word.length(); i++)
            {
                if(!set.contains(word.charAt(i)))
                {
                    break;
                }

                if(i == word.length() -1)
                {
                    consistent++;
                }
            }
        }

        return consistent;
    }
}
