class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n];
        return helper(1,n,dp);
    }
    int helper(int i,int n,int[] dp){
        if(i>=n)return 1;
        if(dp[i]!=0) return dp[i];
        int one=helper(i+1,n,dp);
        int two=helper(i+2,n,dp);
        return dp[i]=one+two;
    }
}