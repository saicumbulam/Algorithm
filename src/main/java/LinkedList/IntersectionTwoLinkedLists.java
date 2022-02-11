package LinkedList;

import LinkedList.Utilities.ListNode;

public class IntersectionTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curr1 = headA;
        ListNode curr2 = headB;

        if (headA == null) return headB;
        if (headB == null) return headA;

        int len1 = length(headA);
        int len2 = length(headB);

        if (len1 < len2)
        {
            return getIntersectionNode(headB, headA);
        }

        while(len1 > len2)
        {
            curr1 = curr1.next;
            len1--;
        }

        while(curr1 != null && curr2 != null)
        {
            if (curr1 == curr2)
            {
                return curr1;
            }

            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        return null;
    }

    private int length(ListNode head)
    {
        ListNode curr = head;
        int count = 0;

        while(curr != null)
        {
            curr = curr.next;
            count++;
        }
        return count;
    }
}
