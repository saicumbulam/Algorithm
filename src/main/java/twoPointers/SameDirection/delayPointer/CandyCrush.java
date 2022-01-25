package twoPointers.SameDirection.delayPointer;

public class CandyCrush {
    public int[][] candyCrush(int[][] board) {
        boolean shouldContinue = false;

        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[0].length-2; j++)
            {
                int v = Math.abs(board[i][j]);
                if( v > 0 && v == Math.abs(board[i][j+1]) && v == Math.abs(board[i][j+2]))
                {
                    board[i][j] = board[i][j+1] = board[i][j+2] = -v;
                    shouldContinue = true;
                }
            }
        }


        for (int i = 0; i < board.length-2; i++)
        {
            for (int j = 0; j < board[0].length; j++)
            {
                int v = Math.abs(board[i][j]);
                if( v > 0 && v == Math.abs(board[i+1][j]) && v == Math.abs(board[i+2][j]))
                {
                    board[i][j] = board[i+1][j] = board[i+2][j] = -v;
                    shouldContinue = true;
                }
            }
        }

        for (int j = 0; j < board[0].length; j++)
        {
            int r = board.length-1;

            for (int i = board.length-1; i >= 0; i--)
            {
                if (board[i][j] >= 0)
                {
                    board[r--][j] = board[i][j];
                }
            }


            for (int i = r; i >= 0; i--)
            {
                board[i][j] = 0;
            }
        }


        return shouldContinue ? candyCrush(board) : board;
    }
}
