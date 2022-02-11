package BinaryTree.BST.Inorder;

import BinaryTree.BST.TreeNode;

import java.util.ArrayList;

public class BSTIterator {
    ArrayList<Integer> nodesSorted;
    int index;

    public BSTIterator(TreeNode root) {

        // Array containing all the nodes in the sorted order
        this.nodesSorted = new ArrayList<Integer>();

        // Pointer to the next smallest element in the BST
        this.index = 0;

        // Call to flatten the input binary search tree
        this._inorder(root);
    }

    private void _inorder(TreeNode root) {

        if (root == null) {
            return;
        }

        this._inorder(root.left);
        this.nodesSorted.add(root.val);
        this._inorder(root.right);
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        return this.nodesSorted.get(this.index++);
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return this.index < this.nodesSorted.size();
    }
}
