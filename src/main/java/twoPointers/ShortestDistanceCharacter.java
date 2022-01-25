package twoPointers;

public class ShortestDistanceCharacter {
    public int[] shortestToChar(String S, char C) {
        int n = S.length();
        int pos = -n;
        int[] res = new int[n];
        for (int i = 0; i < n; ++i) {
            if (S.charAt(i) == C) pos = i;
            res[i] = Math.abs(i - pos);
        }
        for (int i = pos - 1; i >= 0; --i) {
            if (S.charAt(i) == C)  pos = i;
            res[i] = Math.min(res[i], Math.abs(i - pos));
        }
        return res;
    }
}
