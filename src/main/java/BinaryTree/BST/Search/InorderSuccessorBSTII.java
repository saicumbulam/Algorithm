package BinaryTree.BST.Search;

public class InorderSuccessorBSTII {
    class Node
    {

        public Node parent;
        public Node right;
        public Node left;
        public int val;
    }

    public Node inorderSuccessor(Node x) {
        if (x.right == null) {
            Node result = x.parent;
            while (result != null && result.val < x.val) {
                result = result.parent;
            }
            return result;
        } else {
            Node result = x.right;
            while (result.left != null) {
                result = result.left;
            }
            return result;
        }
    }
}
