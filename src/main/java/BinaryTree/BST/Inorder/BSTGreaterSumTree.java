package BinaryTree.BST.Inorder;

import BinaryTree.BST.TreeNode;

public class BSTGreaterSumTree {
    int sum = 0;

    public TreeNode bstToGst(TreeNode root) {
        if (root.right != null) bstToGst(root.right);
        sum += root.val;
        root.val = sum;
        if (root.left != null) bstToGst(root.left);
        return root;
    }
}
