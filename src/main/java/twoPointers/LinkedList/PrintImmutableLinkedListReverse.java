package twoPointers.LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PrintImmutableLinkedListReverse {
    public void printLinkedListInReverse(ImmutableListNode head) {
        List<Integer> list = new ArrayList<>();
        ImmutableListNode curr = head;
        Stack<ImmutableListNode> stack = new Stack<>();

        while(curr != null)
        {
            stack.push(curr);
            curr= curr.getNext();
        }
        System.out.println(stack.size());

        while(!stack.isEmpty())
        {
            stack.pop().printValue();
        }
    }
}
