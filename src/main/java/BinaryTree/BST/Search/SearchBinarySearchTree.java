package BinaryTree.BST.Search;

import BinaryTree.BST.TreeNode;

public class SearchBinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null && val != root.val)
        {
            if(val < root.val)
            {
                root = root.left;
            }
            else
            {
                root = root.right;
            }
        }
        return root;
    }
}
