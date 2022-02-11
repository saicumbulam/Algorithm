package BinaryTree.BST.PreorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePreorderTraversal {
    class Node
    {

        public int val;
        public Iterable<? extends Node> children;
    }
    List<Integer> list;

    public List<Integer> preorder(Node root) {
        list = new ArrayList<>();
        Calculate(root);
        return list;
    }

    private void Calculate(Node root)
    {
        if(root == null) return;

        list.add(root.val);

        for(Node item: root.children)
        {
            Calculate(item);
        }
    }
}
