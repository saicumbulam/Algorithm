package twoPointers.LinkedList;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;

        ListNode curr = head;
        int length = 0;

        while(curr.next != null)
        {
            curr = curr.next;
            length++;
        }

        length += 1;

        k %= length;
        if (k < 0)
        {
            k += length;
        }

        curr.next = head;

        //stop at 3
        int skip = length - k;
        ListNode prev = null;
        curr = head;

        while(skip > 0)
        {
            prev = curr;
            curr = curr.next;
            skip--;
        }

        //point at 4
        head = curr;
        //cut off 3
        prev.next = null;
        return head;
    }
}
