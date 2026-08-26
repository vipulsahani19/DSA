class Solution {
    public int countSquares(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int count=0;
        for(int i=0;i<n;i++){
            if(matrix[0][i]==1) count++;
        }
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                if(j==0){
                    if(matrix[i][j]==1){
                        count++;
                        continue;
                    }
                }
                if(matrix[i][j]==1){
                    matrix[i][j]=matrix[i][j]+Math.min(matrix[i-1][j-1],Math.min(matrix[i-1][j],matrix[i][j-1]));
                    count+=matrix[i][j];
                }
            }
        }
        return count;
    
    }
}