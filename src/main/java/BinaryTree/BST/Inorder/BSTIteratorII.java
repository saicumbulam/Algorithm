package BinaryTree.BST.Inorder;

import BinaryTree.BST.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BSTIteratorII {
    Deque<TreeNode> stack;
    List<Integer> arr;
    TreeNode last;
    int pointer;

    public BSTIteratorII(TreeNode root) {
        last = root;
        stack = new ArrayDeque();
        arr = new ArrayList();
        pointer = -1;
    }

    public boolean hasNext() {
        return !stack.isEmpty() || last != null || pointer < arr.size() - 1;
    }

    public int next() {
        ++pointer;
        // if the pointer is out of precomputed range
        if (pointer == arr.size()) {
            // process all predecessors of the last node:
            // go left till you can and then one step right
            while (last != null) {
                stack.push(last);
                last = last.left;
            }
            TreeNode curr = stack.pop();
            last = curr.right;

            arr.add(curr.val);
        }

        return arr.get(pointer);
    }

    public boolean hasPrev() {
        return pointer > 0;
    }

    public int prev() {
        --pointer;
        return arr.get(pointer);
    }
}
