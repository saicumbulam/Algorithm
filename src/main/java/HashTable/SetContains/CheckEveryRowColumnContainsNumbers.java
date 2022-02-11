package HashTable.SetContains;

import java.util.HashSet;
import java.util.Set;

public class CheckEveryRowColumnContainsNumbers {
    public boolean checkValid(int[][] matrix) {
        for (int r = 0, n = matrix.length; r < n; ++r) {
            Set<Integer> row = new HashSet<>();
            Set<Integer> col = new HashSet<>();
            for (int c = 0; c < n; ++c) {
                if (!row.add(matrix[r][c]) || !col.add(matrix[c][r])) {
                    return false;
                }
            }
        }
        return true;
    }
}
