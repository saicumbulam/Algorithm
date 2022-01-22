package BFS;
import java.util.*;

public class levelordertraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
        {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty())
        {
            int listSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            
            for (int i = 0; i < listSize; i++)
            {
                TreeNode polled = queue.poll();
                currentLevel.add(polled.val);
                
                if (polled.left != null)
                {
                    queue.add(polled.left);
                }
                if (polled.right != null)
                {
                    queue.add(polled.right);
                }                
            }
            result.add(currentLevel);
        }
        
        return result;
    }    
}
