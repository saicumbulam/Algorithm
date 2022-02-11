package LinkedList.FastSlow;

import LinkedList.Utilities.ListNode;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        do
        {
            slow = slow.next;
            fast = fast.next;
            if(fast != null)
            {
                fast = fast.next;
            }
            else
            { break;}

            if(slow == fast) return true;
        }
        while(slow != null && fast != null && slow != fast);

        return false;
    }
}
