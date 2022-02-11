package HashTable.ArrayMap;

import java.util.Arrays;

public class CheckifAllCharactersHaveEqualNumberOccurrences {
    public boolean areOccurrencesEqual(String s) {
        int cnt[] = new int[26];
        s.chars().forEach(ch -> ++cnt[ch - 'a']);
        int m_cnt = Arrays.stream(cnt).max().getAsInt();
        return Arrays.stream(cnt).allMatch(c -> c == m_cnt);
    }
}
