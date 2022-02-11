package BinaryTree.BST.Inorder;

public class ConvertBSTSorteddll {
    class Node
    {

        public Node left;
        public Node right;
    }
    Node front = null;
    Node last = null;

    public Node treeToDoublyList(Node root) {
        if (root == null) return null;

        Calculate(root);
        front.left = last;
        last.right = front;
        return front;
    }

    private void Calculate(Node root)
    {
        if (root == null) return;

        Calculate(root.left);

        if (last != null)
        {
            last.right = root;
            root.left = last;
        }
        else
        {
            front = root;
        }
        last = root;

        Calculate(root.right);
    }
}
