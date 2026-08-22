class Solution {
    public int uniquePaths(int m, int n) {
        if(m==1 || n==1) return 1;
        int[][] dp=new int [m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],1);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0) dp[i][j]=1;
                else dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        } return dp[m-1][n-1];
        // return helper(dp,m,n);
    }

    // int helper(int[][] dp,int m,int n){
    //     if(m==1 || n==1) return 1;
    //     if(dp[m][n]!=0) return dp[m][n];
    //     return dp[m][n]=helper(dp,m-1,n)+helper(dp,m,n-1);
    // }
}