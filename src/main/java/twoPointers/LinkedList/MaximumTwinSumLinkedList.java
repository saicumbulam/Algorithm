package twoPointers.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class MaximumTwinSumLinkedList {
    public int pairSum(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null){
            list.add(curr.val);
            curr = curr.next;
        }

        int res = 0;
        int n = list.size();
        for(int i=0; i<n/2; i++){
            int sum = list.get(i) + list.get(n-1-i);
            res = Math.max(res, sum);
        }

        return res;
    }
}
