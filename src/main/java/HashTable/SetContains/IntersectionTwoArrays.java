package HashTable.SetContains;

import java.util.HashSet;

public class IntersectionTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int item: nums1)
        {
            set1.add(item);
        }
        for (int item: nums2)
        {
            if (set1.contains(item))
            {
                set2.add(item);
            }
        }


        int[] result = new int[set2.size()];
        int index = 0;

        for(int item: set2)
        {
            result[index++] = item;
        }

        return result;
    }
}
