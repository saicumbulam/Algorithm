package BinaryTree.BST.Unique;

import BinaryTree.BST.TreeNode;

public class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;

        return Calculate(root, null, null);
    }

    private boolean Calculate(TreeNode root, Integer low, Integer high)
    {
        if (root == null) return  true;

        if (low != null && root.val <= low)
        {
            return false;
        }

        if (high != null && root.val >= high)
        {
            return false;
        }

        return Calculate(root.left, low, root.val) && Calculate(root.right, root.val, high);
    }
}
