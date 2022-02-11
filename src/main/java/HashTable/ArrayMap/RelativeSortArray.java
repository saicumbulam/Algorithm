package HashTable.ArrayMap;

import java.util.Arrays;

public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int k = 0;
        int[] cnt = new int[1001];
        int[] ans = new int[arr1.length];

        Arrays.stream(arr1).forEach(x -> cnt[x]++);

        for (int i : arr2)
        {
            while (cnt[i] > 0)
            {
                ans[k++] = i;
                cnt[i]--;
            }
        }

        for (int i = 0; i < 1001; ++i)
        {
            while (cnt[i] > 0)
            {
                ans[k++] = i;
                cnt[i]--;
            }
        }

        return ans;
    }
}
