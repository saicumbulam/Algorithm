package twoPointers.TwoSum;

import java.util.HashSet;

public class TwoSumIV {
    HashSet<Integer> set = new HashSet<>();
    boolean flag = false;

    public boolean findTarget(TreeNode root, int k) {
        calc(root, k);
        return flag;
    }

    private void calc(TreeNode root, int k)
    {
        if(root == null) return;

        calc(root.left, k);

        if(set.contains(k - root.val))
        {
            flag = true;
        }
        else
        {
            set.add(root.val);
        }

        calc(root.right, k);
    }
}
