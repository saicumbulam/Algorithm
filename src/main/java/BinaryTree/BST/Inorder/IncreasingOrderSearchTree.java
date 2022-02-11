package BinaryTree.BST.Inorder;

import BinaryTree.BST.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IncreasingOrderSearchTree {
    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummy = new TreeNode(-1);

        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = dummy;

        while(root != null || stack.size() > 0)
        {
            if (root != null)
            {
                stack.push(root);
                root = root.left;
                continue;
            }

            root = stack.pop();
            curr.right = new TreeNode(root.val);
            curr = curr.right;
            root = root.right;
        }

        return dummy.right;
    }
}
