package Recursion;

import Commons.Node;

import java.util.HashMap;
import java.util.Map;

public class CloneBinaryTreeRandomPointer {
    public Node copyRandomBinaryTree(Node root) {
        Map<Node, Node> map = new HashMap<>();
        return doClone(root, map);
    }

    private Node doClone(Node root, Map<Node, Node> map) {
        if (root == null) {
            return null;
        }
        if (map.containsKey(root)) {
            return map.get(root);
        } else {
            Node cur = new Node(root.val);
            map.put(root, cur);
            cur.left = doClone(root.left, map);
            cur.right = doClone(root.right, map);
            cur.random = doClone(root.random, map);
            return cur;
        }
    }
}
