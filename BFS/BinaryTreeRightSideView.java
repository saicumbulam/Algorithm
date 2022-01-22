package BFS;
import java.util.*;


public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return new ArrayList<>();
        
        List<Integer> result = new ArrayList<>();
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty())
        {
            int size = queue.size();
            
            for(int i = 0; i < size; i++)
            {
                TreeNode polled = queue.poll();
                
                if(i == size-1)
                {
                    result.add(polled.val);
                }
                
                if (polled.left != null)
                {
                    queue.add(polled.left);
                }
                if (polled.right != null)
                {
                    queue.add(polled.right);
                }
            }
        }
        
        return result;        
    }
}
