package BFS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeVerticalOrderTraversal {
    class pair
    {
        TreeNode root;
        int col;
        
        public pair(TreeNode root, int col)
        {
            this.root = root;
            this.col = col;
        }
    }
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        
        Queue<pair> queue = new LinkedList<>();
        queue.add(new pair(root, 0));
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        
        int minCol = Integer.MAX_VALUE;
        int maxCol = Integer.MIN_VALUE;
        int col = 0;
        
        while(!queue.isEmpty())
        {
            int size = queue.size();
            
            for(int  i = 0; i < size; i++)
            {
                pair polled = queue.poll();
                root = polled.root;
                col = polled.col;
                
                minCol = Math.min(minCol, polled.col);
                maxCol = Math.max(maxCol, polled.col);
                
                if (!map.containsKey(col))
                {
                    map.put(col, new ArrayList<>());
                }
                
                map.get(col).add(root.val);
                
                if (root.left != null)
                {
                    queue.add(new pair(root.left, col-1));
                }
                
                if (root.right != null)
                {
                    queue.add(new pair(root.right, col+1));
                }
            }
        }
        
        
        for(int  i = minCol; i <= maxCol; i++)
        {
            result.add(new ArrayList<>(map.get(i)));
        }
        
        return result;
    } 
}
