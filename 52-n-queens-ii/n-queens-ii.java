class Solution {
    public int totalNQueens(int n) {
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        return solve(0,board);
    }
    int solve(int row,char[][] board){
        if(row==board.length) return 1;
        int count=0;
        for(int col=0;col<board.length;col++){
            if(issafe(row,col,board)){
                board[row][col]='Q';
                count+=solve(row+1,board);
                board[row][col]='.';
            }
        }
        return count;
    }

    boolean issafe(int row,int col,char[][] board){
        int n=board.length;
        int i=row-1;
        while(i>=0){
            if(board[i][col]=='Q') return false;
            i--;
        }
        i=row-1;
        int j=col-1;
        while(i>=0 && j>=0){
            if(board[i--][j--]=='Q') return false;
        }
        i=row-1;
        j=col+1;
        while(i>=0 && j<n){
            if(board[i--][j++]=='Q') return false;
        }
        return true;
    }
}