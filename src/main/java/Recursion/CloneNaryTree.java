package Recursion;

import Commons.Node;

public class CloneNaryTree {
    public Node cloneTree(Node root) {
        if (root == null) return root;
        Node nodeCopy = new Node(root.val);

        for (Node child : root.children) {
            nodeCopy.children.add(this.cloneTree(child));
        }

        return nodeCopy;
    }
}
