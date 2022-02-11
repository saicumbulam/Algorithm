package BinaryTree.BST.Search;

import BinaryTree.BST.TreeNode;

public class InsertBST {
    public TreeNode insertIntoBST(TreeNode root, int target) {
        if(root == null) return new TreeNode(target);

        if(target < root.val)
        {
            root.left = insertIntoBST(root.left, target);
        }
        else
        {
            root.right = insertIntoBST(root.right, target);
        }

        return root;
    }
}
