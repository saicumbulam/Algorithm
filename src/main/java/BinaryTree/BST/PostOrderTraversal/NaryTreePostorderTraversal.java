package BinaryTree.BST.PostOrderTraversal;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePostorderTraversal {
    class Node
    {

        public List<Node> children;
        public Integer val;
    }
    List<Integer> list;

    public List<Integer> postorder(Node root) {
        list = new ArrayList<>();
        Calculate(root);
        return list;
    }

    private void Calculate(Node root)
    {
        if(root == null) return;

        for(Node item: root.children)
        {
            Calculate(item);
        }
        list.add(root.val);
    }
}
