package HashTable.SetContains;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TwoOutofThree {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int item: nums1)
        {
            set1.add(item);
        }

        for(int item: nums2)
        {
            if(set1.contains(item))
            {
                res.add(item);
            }
            set2.add(item);
        }

        for(int item: nums3)
        {
            if((set1.contains(item) ||
                    set2.contains(item)))
            {
                res.add(item);
            }
        }

        return new ArrayList(res);
    }
}
