package BinaryTree.BST.Inorder;

import BinaryTree.BST.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class ClosestBSTValueII {
    LinkedList<Integer> list = new LinkedList<Integer>();
    boolean flag = false;

    public List<Integer> closestKValues(TreeNode root, double target, int k) {
        calc(root, target, k);
        return list;
    }

    /**
     * @return <code>true</code> if result is already found.
     */
    private void calc(TreeNode root, double target, int k) {
        if (root == null) return;

        calc(root.left, target, k);

        if (list.size() == k) {
            if (Math.abs(list.getFirst() - target) <
                    Math.abs(root.val - target)) {
                return;
            } else {
                list.removeFirst();
            }
        }

        list.addLast(root.val);
        calc(root.right, target, k);
    }
}
