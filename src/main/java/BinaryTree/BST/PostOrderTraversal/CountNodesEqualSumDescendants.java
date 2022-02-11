package BinaryTree.BST.PostOrderTraversal;

import BinaryTree.BST.TreeNode;

public class CountNodesEqualSumDescendants {
    int r = 0;

    public int equalToDescendants(TreeNode root) {
        sum(root);
        return r;
    }

    int sum(TreeNode node) {
        if (node == null)
            return 0;
        int sum = sum(node.left) + sum(node.right);
        if (sum == node.val)
            r++;
        return sum + node.val;
    }
}
