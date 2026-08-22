class Solution {
    public int minPathSum(int[][] grid) {
        
        int[][] dp = new int[grid.length][grid[0].length];

        for(int i = 0; i < grid.length; i++){
            Arrays.fill(dp[i], -1);
        }

        

        return helper(grid, 0, 0, dp);
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