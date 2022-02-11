package String.FindWord;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        List<String> bannedList = new ArrayList<>();
        for(String item: banned)
        {
            bannedList.add(item);
        }

        return Calculate(paragraph, bannedList);
    }

    private String Calculate(String paragraph, List<String> bannedList)
    {
        int i = 0, j = 0, maxFreq = 0;
        String result = "";

        HashMap<String, Integer> map = new HashMap<>();

        paragraph = paragraph.toLowerCase();

        while(j < paragraph.length())
        {
            while (j < paragraph.length() && Character.isLetter(paragraph.charAt(j)))
            {
                j++;
            }

            if (j - i +1 > 0)
            {
                String word = paragraph.substring(i, j);
                if(!bannedList.contains(word) && !word.equals(""))
                {
                    map.put(word, map.getOrDefault(word, 0)+1);
                    if(map.get(word) > maxFreq)
                    {
                        maxFreq = map.get(word);
                        result = word;
                    }
                }
            }

            j++;
            i = j;
        }

        return result;
    }
}
