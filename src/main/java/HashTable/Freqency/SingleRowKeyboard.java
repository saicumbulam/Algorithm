package HashTable.Freqency;

import java.util.HashMap;

public class SingleRowKeyboard {
    public int calculateTime(String keyboard, String word) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < keyboard.length(); i++)
        {
            map.put(keyboard.charAt(i), i);
        }

        int sum = map.get(word.charAt(0));
        for(int i = 1; i < word.length(); i++)
        {
            sum += Math.abs(map.get(word.charAt(i))- map.get(word.charAt(i-1)));
        }

        return sum;
    }
}
