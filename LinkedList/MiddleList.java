package LinkedList;

class Solution1 {
    public ListNode middleNode(ListNode head) {
        if(head == null) return null;
        ListNode slow = head;
        ListNode fast = head.next;
    
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
    
        return slow;
    }
}
