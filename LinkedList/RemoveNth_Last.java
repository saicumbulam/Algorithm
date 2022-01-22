package LinkedList;

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode curr = head;
        
        while(curr != null)
        {
            curr = curr.next;
            length++;
        }
        
        int skip = length - n;
        curr = head;
        ListNode prev = null;
        
        while(skip > 0)
        {
            prev = curr;
            curr = curr.next;
            skip--;
        }
        
        /*
        Same till Nth_Last
         */
        if(prev != null)
        {
            prev.next = curr.next;
        }
        else
        {
            head = head.next;
        }
        
        return head;
    }
}
