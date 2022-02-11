package BinaryTree.BST.Search;

import BinaryTree.BST.TreeNode;

public class InorderSuccessorBST {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode target) {
        TreeNode successor = null;
        while (root != null)
        {
            if(target.val < root.val)
            {
                successor = root;
                root = root.left;
            }
            else
            {
                root = root.right;
            }
        }
        return successor;
    }
}
