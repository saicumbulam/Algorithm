package BinaryTree.BST.BFS;

import BinaryTree.BST.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindAllTheLonelyNodes {
    public List<Integer> getLonelyNodes(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty())
        {
            int size = queue.size();
            for(int i = 0; i < size; i++)
            {
                TreeNode polled = queue.poll();

                if(polled.left == null && polled.right != null)
                {
                    result.add(polled.right.val);
                }
                else if (polled.left != null && polled.right == null)
                {
                    result.add(polled.left.val);
                }


                if(polled.left != null)
                {
                    queue.offer(polled.left);
                }

                if(polled.right != null)
                {
                    queue.offer(polled.right);
                }
            }
        }

        return result;
    }
}
