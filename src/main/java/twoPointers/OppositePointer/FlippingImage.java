package twoPointers.OppositePointer;

public class FlippingImage {
    public int[][] flipAndInvertImage(int[][] A) {
        ReverseRow(A);
        Convert1_0(A);
        return A;
    }

    private void Convert1_0(int[][] A) {
        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < A[0].length; j++)
            {
                if (A[i][j] == 0)
                {
                    A[i][j] = 1;
                }
                else if (A[i][j] == 1)
                {
                    A[i][j] = 0;
                }
            }
        }
    }

    private void ReverseRow(int[][] A) {
        for(int i = 0; i < A.length; i++)
        {
            int start = 0, end = A[0].length-1;

            while(start < end)
            {
                int temp = A[i][start];
                A[i][start] = A[i][end];
                A[i][end] = temp;
                start++;
                end--;
            }
        }
    }
}
