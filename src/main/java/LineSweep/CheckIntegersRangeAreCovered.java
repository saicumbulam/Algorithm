package LineSweep;

public class CheckIntegersRangeAreCovered {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] line = new int[52];
        for (var r : ranges) {
            line[r[0]] += 1;
            line[r[1] + 1] -= 1;
        }
        int overlaps = 0;
        for (int i = 1; i <= right; ++i) {
            overlaps += line[i];
            if (i >= left && overlaps == 0)
                return false;
        }
        return true;
    }
}
