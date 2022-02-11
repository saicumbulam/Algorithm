package BinaryTree.BST.BFS;

import BinaryTree.BST.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RangeSumBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;

        List<Integer> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int sum = 0;

        while(!queue.isEmpty())
        {
            int size = queue.size();

            for(int i = 0; i < size; i++)
            {
                TreeNode polled = queue.poll();

                if(polled.val >= low && polled.val <= high)
                {
                    sum += polled.val;
                }

                if (polled.left != null && polled.val >= low)
                {
                    queue.add(polled.left);
                }
                if (polled.right != null && polled.val <= high)
                {
                    queue.add(polled.right);
                }
            }

        }

        return sum;
    }
}
