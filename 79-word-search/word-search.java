class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        char[] wordChar=word.toCharArray();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==wordChar[0] && exists(i,j,board,wordChar,0)){
                    return true;
                }
            }
        }
        return false;
    }
    boolean exists(int i,int j,char[][] board,char[] wordChar,int idx){
        if (idx == wordChar.length) return true;
        if(i<0 || j<0 || i>board.length-1 || j>board[0].length-1 || board[i][j]=='*') return false;
        if(board[i][j]!=wordChar[idx]) return false;
        char ch=board[i][j];
        board[i][j]='*';
        boolean res=(exists(i+1,j,board,wordChar,idx+1) || exists(i-1,j,board,wordChar,idx+1) || exists(i,j+1,board,wordChar,idx+1) || exists(i,j-1,board,wordChar,idx+1));
        board[i][j]=ch;
        return res;
    }
}