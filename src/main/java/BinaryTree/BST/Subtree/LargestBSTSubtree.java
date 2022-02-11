package BinaryTree.BST.Subtree;

import BinaryTree.BST.TreeNode;

public class LargestBSTSubtree {
    int max = 0;
    int count = 0;

    public int largestBSTSubtree(TreeNode root) {
        if(root == null) return 0;

        boolean result = Calculate(root, null, null);

        if(result)
        {
            max = Math.max(max, count);
        }
        count = 0;

        largestBSTSubtree(root.left);
        largestBSTSubtree(root.right);
        return max;
    }

    private boolean Calculate(TreeNode root, Integer low, Integer high)
    {
        if(root == null) return true;

        if(low != null && root.val <= low)
        {
            return false;
        }

        if(high != null && root.val >= high)
        {
            return false;
        }
        count++;

        return Calculate(root.left, low, root.val) &&
                Calculate(root.right, root.val, high);
    }
}
