package LinkedList;

class Solution2 {
    public ListNode nthToLast(ListNode head, int n) {
        int length = 0;
        ListNode curr = head;
        while(curr !=null )
        {
            curr = curr.next;
            length++;
        }
        
        int skip = length - n;
        curr = head;
        
        while(skip > 0){
            curr = curr.next;
            skip--;
        }
        
        return curr;
    }
}