package HashTable.Freqency;

import java.util.HashMap;
import java.util.Map;

public class NumberEquivalentDominoPairs {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        int res = 0;
        for (int[] domino : dominoes) {

            int num = Math.min(domino[0], domino[1]) * 10 + Math.max(domino[0], domino[1]);
            int currCount = counts.getOrDefault(num, 0);
            res += currCount;
            counts.put(num, currCount + 1);
        }
        return res;
    }
}
