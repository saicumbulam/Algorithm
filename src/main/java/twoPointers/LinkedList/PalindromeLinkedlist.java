package twoPointers.LinkedList;

public class PalindromeLinkedlist {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode first = head;
        ListNode second = reverse(slow);

        while(first != null && second != null)
        {
            if(first.val != second.val)
            {
                return false;
            }
            first = first.next;
            second = second.next;
        }

        if(first == null || second == null)
        {
            return true;
        }

        return false;
    }


    private ListNode reverse(ListNode head)
    {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
