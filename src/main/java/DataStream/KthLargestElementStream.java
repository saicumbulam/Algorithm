package DataStream;

import java.util.PriorityQueue;

public class KthLargestElementStream {
    int k;
    PriorityQueue<Integer> maxHeap;

    public KthLargestElementStream(int k, int[] nums) {
        maxHeap = new PriorityQueue<>();
        this.k = k;

        for (int i = 0; i< nums.length; i++)
        {
            if (maxHeap.size() > k)
            {
                maxHeap.poll();
            }

            maxHeap.add(nums[i]);
        }
    }

    public int add(int val) {
        maxHeap.add(val);

        while (maxHeap.size() > k)
        {
            maxHeap.poll();
        }


        int temp = maxHeap.peek();
        return temp;
    }
}
