package BinaryTree.BST.Unique;

import BinaryTree.BST.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class UniqueBSTII {
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> result = new ArrayList<>();
        if (n == 0) return result;

        return Finder(1, n);
    }

    private List<TreeNode> Finder(int start, int end)
    {
        List<TreeNode> result = new ArrayList<>();

        if (start > end)
        {
            result.add(null);
            return result;
        }

        for (int i = start; i <= end; i++)
        {
            List<TreeNode> leftSubtree = Finder(start, i-1);
            List<TreeNode> rightSubtree = Finder(i+1, end);

            for(TreeNode left: leftSubtree)
            {
                for(TreeNode right: rightSubtree)
                {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    result.add(root);
                }
            }
        }

        return result;
    }
}
