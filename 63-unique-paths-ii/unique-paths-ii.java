class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int dp[][]=new int[m][n];
        
        return helper(obstacleGrid,dp,m-1,n-1);
    }
    int helper(int[][] arr,int[][] dp,int i,int j){
        if(i < 0 || j < 0 ||arr[i][j]==1) return 0;
        if(i==0 && j==0) return 1;
        if(dp[i][j]!=0) return dp[i][j];
        return dp[i][j]=helper(arr,dp,i,j-1)+helper(arr,dp,i-1,j);
    }
}