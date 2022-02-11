package BinaryTree.BST.SortedArrayToBST;

import BinaryTree.BST.TreeNode;

public class ConstructBSTPreorderTraversal {
    int index = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return construct(preorder, Integer.MAX_VALUE);
    }

    private TreeNode construct(int[] arr, int bound)
    {
        if (index >= arr.length || arr[index] > bound)
        {
            return null;
        }

        TreeNode root = new TreeNode(arr[index++]);
        root.left = construct(arr, root.val);
        root.right = construct(arr, bound);
        return root;
    }
}
