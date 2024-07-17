class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);

    }

    private boolean solve(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int rowIndex = 0; rowIndex < 9; rowIndex++) {
                if (board[row][rowIndex] == '.') {
                    for (char c = '1'; c <= '9'; c++) {
                        if (isPossible(board, row, rowIndex, c)) {
                            board[row][rowIndex] = c;
                            if (solve(board)) {
                                return true;
                            }
                            board[row][rowIndex] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isPossible(char[][] board, int row, int rowIndex, char c) {
        for (int i = 0; i < 9; i++) {
            if (board[i][rowIndex] == c || board[row][i] == c
                    || board[row / 3 * 3 + i / 3][rowIndex / 3 * 3 + i % 3] == c)
                return false;
        }
        return true;
    }
}