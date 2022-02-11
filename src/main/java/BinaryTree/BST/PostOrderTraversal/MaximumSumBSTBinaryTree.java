package BinaryTree.BST.PostOrderTraversal;

import BinaryTree.BST.TreeNode;

public class MaximumSumBSTBinaryTree {
    class NodeWrapper
    {
        TreeNode node;
        int sum;
        int min;
        int max;
        boolean isValid;

        public NodeWrapper(TreeNode node)
        {
            this.node = node;
            this.sum = node.val;
            this.min = node.val;
            this.max = node.val;
            isValid = true;
        }
    }

    int max = 0;
    public int maxSumBST(TreeNode root) {
        Finder(root);
        return max;
    }


    private NodeWrapper Finder(TreeNode root)
    {
        if(root == null) return null;

        NodeWrapper left = Finder(root.left);
        NodeWrapper right = Finder(root.right);

        NodeWrapper curr = new NodeWrapper(root);

        if(left != null)
        {
            curr.sum += left.sum;
            curr.max = Math.max(left.max, curr.max);
            curr.min = Math.min(left.min, curr.min);
            curr.isValid = left.isValid && curr.node.val > left.max;
        }

        if(right != null)
        {
            curr.sum += right.sum;
            curr.max = Math.max(right.max, curr.max);
            curr.min = Math.min(right.min, curr.min);
            curr.isValid &= right.isValid && curr.node.val < right.min;
        }

        if(curr.isValid)
        {
            max = Math.max(max, curr.sum);
        }

        return curr;
    }
}
