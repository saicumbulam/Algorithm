package TwoPointers;

/**
 * nums = [5, 1, 6, 1]
target=1
Output: 
[1, 1, 5, 6]
Explanation: 
1 is target, so you should keep them in the front of array
 */
public class movingTarget {
    public void MoveTarget(int[] nums, int target) {
        
        int count = 0;
        int left = nums.length - 1, right = nums.length - 1;
        
        while (left >= 0) {
            if (nums[left] != target) {
                nums[right] = nums[left];
                right -= 1;
            } else {
                count += 1;
            }
            left -= 1;
        }
        for (int i = 0; i < count; i++) {
            nums[i] = target;
        }
    }
}
