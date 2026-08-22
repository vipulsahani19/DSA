class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length];
        int n=cost.length;
        dp[0]=cost[0];
        dp[1]=cost[1];
        for(int i=2;i<n;i++){
            dp[i]=Math.min(cost[i] +dp[i-1],cost[i] +dp[i-2]);
        }
        return Math.min(dp[n-2],dp[n-1]);
        // Arrays.fill(dp,-1);
        // helper(0,cost,dp);
        // // return Math.min(helper(0,cost,dp),helper(1,cost,dp));
        // return Math.min(dp[0],dp[1]);
    }
    // int helper(int i,int[] cost,int[] dp){
    //     if(i>=cost.length) return 0;
    //     if(dp[i]!=-1) return dp[i];
    //     return dp[i]=cost[i] + Math.min(helper(i+1,cost,dp),helper(i+2,cost,dp));
    // }
}