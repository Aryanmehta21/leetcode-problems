class Solution {
    int count;
        public int totalNQueens(int n) {
            int[] cols = new int[n];
            Arrays.fill(cols, -1);
            count = 0;
            backtrack(cols, 0);
            return count;
        }
    
    private void backtrack(int[] cols, int row) {
        int n = cols.length;
        if (row == n) {
            count++;
            return;
        }
        
        for (int i = 0; i < n; i++) {
            cols[row] = i;
            if (isValid(cols, row)) {
                backtrack(cols, row + 1);
            }
        }
        cols[row] = -1;
    }
    
    private boolean isValid(int[] cols, int row) {
        for (int i = 0; i < row; i++) {
            int diff = Math.abs(cols[i] - cols[row]);
            if (diff == 0 || diff == row - i) {
                return false;
            }
        }
        return true;
    }
    }