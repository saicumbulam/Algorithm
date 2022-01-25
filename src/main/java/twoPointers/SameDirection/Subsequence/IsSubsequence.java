package twoPointers.SameDirection.Subsequence;

public class IsSubsequence {
    public boolean isSubsequence(String x, String y) {
        if(x.isEmpty()) return true;

        int j = 0;
        int i = 0;
        while (i < y.length() && j < x.length())
        {
            if (x.charAt(j) == y.charAt(i)) j++;
            i++;

        }
        return j == x.length();
    }
}
