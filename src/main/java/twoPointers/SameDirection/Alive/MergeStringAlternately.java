package twoPointers.SameDirection.Alive;

public class MergeStringAlternately {
    public String mergeAlternately(String w1, String w2) {
        StringBuilder res = new StringBuilder();
        int i = 0;
        int j = 0;

        boolean first = true;
        while (i < w1.length() && j < w2.length()) {
            if (first)
            {
                res.append(w1.charAt(i));
                i++;
            }
            else {
                res.append(w2.charAt(j));
                j++;
            }
            first = !first;
        }
        while (i < w1.length()) {
            res.append(w1.charAt(i));
            i++;
        }
        while (j < w2.length()) {
            res.append(w2.charAt(j));
            j++;
        }
        return res.toString();
    }
}
