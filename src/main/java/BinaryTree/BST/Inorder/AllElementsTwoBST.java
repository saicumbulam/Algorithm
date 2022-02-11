package BinaryTree.BST.Inorder;

import BinaryTree.BST.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AllElementsTwoBST {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> res=new ArrayList<>();
        Stack<TreeNode> stack1=new Stack<>();
        Stack<TreeNode> stack2=new Stack<>();
        TreeNode cur1=root1, cur2=root2;
        while(cur1!=null || cur2!=null || !stack1.isEmpty()
                || !stack2.isEmpty()){
            while(cur1!=null){
                stack1.push(cur1);
                cur1=cur1.left;
            }
            while(cur2!=null){
                stack2.push(cur2);
                cur2=cur2.left;
            }
            if(stack2.isEmpty() || !stack1.isEmpty() &&
                    stack1.peek().val<=stack2.peek().val){
                cur1=stack1.pop();
                res.add(cur1.val);
                cur1=cur1.right;
            }else{
                cur2=stack2.pop();
                res.add(cur2.val);
                cur2=cur2.right;
            }
        }
        return res;
    }
}
