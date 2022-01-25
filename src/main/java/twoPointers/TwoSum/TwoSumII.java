package twoPointers.TwoSum;

public class TwoSumII {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while(left < right)
        {
            int currentSum = nums[left] + nums[right];
            if (target == currentSum)
            {
                return new int[]{left+1, right+1};
            }
            if (target > currentSum)
            {
                left++;
            }
            else
            {
                right--;
            }
        }

        return new int[]{-1};
    }
}
