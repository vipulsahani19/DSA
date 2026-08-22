class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp = new int[grid.length][grid[0].length];

        // for(int i = 0; i < grid.length; i++){
        //     Arrays.fill(dp[i], -1);
        // }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0)dp[i][j]=grid[i][j];
                else if(i==0) dp[i][j]=grid[i][j]+dp[i][j-1];
                else if(j==0) dp[i][j]=grid[i][j]+dp[i-1][j];
                else dp[i][j]=grid[i][j] + Math.min(dp[i][j-1],dp[i-1][j]);
            }
        } 
        return dp[m-1][n-1];
    }

    int helper(int[][] grid, int m, int n, int[][] dp){

        if(n == grid[0].length || m == grid.length)
            return Integer.MAX_VALUE;

        if(m == grid.length - 1 && n == grid[0].length - 1)
            return grid[m][n];

        if(dp[m][n] != -1)
            return dp[m][n];

        return dp[m][n] = grid[m][n] + Math.min(
            helper(grid, m + 1, n, dp),
            helper(grid, m, n + 1, dp)
        );
    }
}