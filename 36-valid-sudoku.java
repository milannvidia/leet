class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] columns = new boolean[9][9];
        boolean[][] squares = new boolean[9][9];
        for (int row = 0; row < 9; row++) {
            for (int rowIndex = 0; rowIndex < 9; rowIndex++) {
                int index = board[row][rowIndex] - '1';
                if (index < 0)
                    continue;
                if (rows[row][index])
                    return false;
                else
                    rows[row][index] = true;

                if (columns[rowIndex][index])
                    return false;
                else
                    columns[rowIndex][index] = true;

                if (squares[row / 3 * 3 + rowIndex / 3][index])
                    return false;
                else
                    squares[row / 3 * 3 + rowIndex / 3][index] = true;
            }
        }
        return true;
    }
}