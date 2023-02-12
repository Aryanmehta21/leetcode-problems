class Solution {
    public List<List<String>> solveNQueens(int n) {
       List<List<String>> result = new ArrayList<>();
       if(n<=0){
            return result;
       } 
       int[] queens = new int[n];
       solve(result, queens, 0, n);
       return result;
    }
    void solve(List<List<String>> result, int[] queens, int row, int n){
        if(row == n){
            List<String> solution = new ArrayList<>();
            for(int i =0;i<n;i++){
                StringBuilder sb = new StringBuilder();
                for(int j =0;j<n;j++){
                    if(j==queens[i]){
                        sb.append('Q');
                    }else{
                        sb.append('.');
                    }
                }
                solution.add(sb.toString());
            }
            result.add(solution);
            return;
        }
        for(int col = 0;col<n;col++){
            if(isValid(queens,row,col)){
                queens[row] = col;
                solve(result, queens,row+1,n);
            }
        }
    }
    boolean isValid(int[] queens, int row, int col){
        for(int i=0;i<row;i++){
            int j=queens[i];
            if(col==j){
                return false;
            }
            if(row-i==Math.abs(col-j)){
                return false;
            }
        }
        return true;
    }
}