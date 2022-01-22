package TwoPointers;

public class InterleavedArray {
    public int[] interleavedArray(int[] A, int[] B) {
        int n = A.length;
        int[] ans = new int[n * 2];
        for (int i = 0; i < n; i++) {
            ans[i * 2] = A[i];
            ans[i * 2 + 1] = B[i];
        }
        return ans;
    }
}
