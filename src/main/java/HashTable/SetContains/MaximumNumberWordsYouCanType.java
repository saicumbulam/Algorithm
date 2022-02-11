package HashTable.SetContains;

import java.util.HashSet;

public class MaximumNumberWordsYouCanType {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> set = new HashSet<>();
        for (char c: brokenLetters.toCharArray())
        {
            set.add(c);
        }

        int count = 0;

        for(String word: text.split(" "))
        {
            count++;
            for(char c: word.toCharArray())
            {
                if(set.contains(c))
                {
                    count--;
                    break;
                }
            }
        }

        return count;
    }
}
