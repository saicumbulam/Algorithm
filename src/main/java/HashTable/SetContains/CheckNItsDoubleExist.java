package HashTable.SetContains;

import java.util.HashSet;

public class CheckNItsDoubleExist {
    public boolean checkIfExist(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(2*nums[i])) {
                return true;
            } else if (nums[i]%2==0) {
                if (set.contains(nums[i]/2)) {
                    return true;
                }
            }
            set.add(nums[i]);
        }

        return false;
    }
}
