package HeavyHitter;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Integer candidate = null;
        int count = 0;

        for(int num: nums)
        {
            if(candidate == null || count == 0)
            {
                candidate = num;
                count++;
            }
            else if (candidate == num)
            {
                count++;
            }
            else if (count > 0)
            {
                count--;
            }
        }

        return candidate;
    }
}
