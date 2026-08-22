class Solution {
    public int uniquePaths(int m, int n) {
        if(m==1 || n==1) return 1;
        int[][] dp=new int [m+1][n+1];
        return helper(dp,m,n);
    }
    int helper(int[][] dp,int m,int n){
        if(m==1 || n==1) return 1;
        if(dp[m][n]!=0) return dp[m][n];
        return dp[m][n]=helper(dp,m-1,n)+helper(dp,m,n-1);
    }
}