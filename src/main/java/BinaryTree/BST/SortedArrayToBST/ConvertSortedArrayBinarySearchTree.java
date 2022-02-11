package BinaryTree.BST.SortedArrayToBST;

import BinaryTree.BST.TreeNode;

public class ConvertSortedArrayBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return Finder(nums, 0, nums.length-1);
    }

    private TreeNode Finder(int[] nums, int start, int end)
    {
        if (start > end)
        {
            return null;
        }
        int mid = (start + end)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = Finder(nums, start, mid-1);
        root.right =  Finder(nums, mid+1, end);
        return root;
    }
}
