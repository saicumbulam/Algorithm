package BinaryTree.BST.Inorder;

import BinaryTree.BST.TreeNode;

public class KthSmallestElementBST {
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        if (root == null)
        {
            return -1;
        }

        int result = kthSmallest(root.left, k);
        if (result != -1)
        {
            return result;
        }

        count++;

        if (count == k)
        {
            return root.val;
        }

        result = kthSmallest(root.right, k);
        if (result != -1)
        {
            return result;
        }

        return -1;

    }
}
