import java.util.HashSet;

public class TwoSumBSTs {
    class TreeNode
    {
        int val;
        TreeNode left, right;
    }

    HashSet<Integer> set = new HashSet<>();

    public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
        calc1(root1, target);
        return calc2(root2);
    }

    private void calc1(TreeNode root, int target)
    {
        if(root == null) return;

        set.add(target - root.val);
        calc1(root.left, target);
        calc1(root.right, target);
    }

    private boolean calc2(TreeNode root)
    {
        if(root == null) return false;

        if (set.contains(root.val))
        {
            return true;
        }
        return calc2(root.left) ||  calc2(root.right);
    }
}
