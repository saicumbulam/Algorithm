package Interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MeetingScheduler {
    public List<Integer> minAvailableDuration(int[][] slots1, int[][] slots2, int duration) {
        Arrays.sort(slots1, (a, b) -> a[0] - b[0]);
        Arrays.sort(slots2, (a, b) -> a[0] - b[0]);

        int i1 = 0, i2 = 0;

        while (i1 < slots1.length && i2 < slots2.length) {
            // find the boundaries of the intersection, or the common slot
            int intersectLeft = Math.max(slots1[i1][0], slots2[i2][0]);
            int intersectRight = Math.min(slots1[i1][1], slots2[i2][1]);
            if (intersectRight - intersectLeft >= duration) {
                return new ArrayList<Integer>(Arrays.asList(intersectLeft, intersectLeft + duration));
            }
            // always move the one that ends earlier
            if (slots1[i1][1] < slots2[i2][1]) {
                i1++;
            } else {
                i2++;
            }
        }
        return new ArrayList<Integer>();
    }
}
