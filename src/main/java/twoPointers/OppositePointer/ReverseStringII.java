package twoPointers.OppositePointer;

public class ReverseStringII {
    public String reverseStr(String s, int k) {
        char[] ans = s.toCharArray();

        for (int start = 0; start < s.length(); start += 2 * k)
        {
            int i = start, j = Math.min(s.length()-1, start+k-1);
            while (i < j)
            {
                char temp = ans[i];
                ans[i] = ans[j];
                ans[j] = temp;
                i++;
                j--;
            }
        }

        return String.valueOf(ans);
    }
}
