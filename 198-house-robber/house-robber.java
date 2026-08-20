class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return loot(0,nums,dp);

    }
    int loot(int i,int[] nums,int[] dp){
        if(i>=nums.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int take=nums[i] +loot(i+2,nums,dp);
        int skip=loot(i+1,nums,dp);
        int ans=Math.max(take,skip);
        dp[i]=ans;
        return ans;
    }
}