package BinaryTree.BST.Search;

import BinaryTree.BST.TreeNode;

public class ClosestBinarySearchTreeValue {
    public int closestValue(TreeNode root, double target) {
        int val, closest = root.val;
        while (root != null)
        {
            val = root.val;
            if (Math.abs(val - target) < Math.abs(closest - target))
            {
                closest = val;
            }

            if(target < root.val)
            {
                root = root.left;
            }
            else
            {
                root = root.right;
            }
            //closest = Math.abs(val - target) < Math.abs(closest - target) ? val : closest;
            //root =   ? root.left : root.right;
        }
        return closest;
    }
}
