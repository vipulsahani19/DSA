class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        dp[0]=nums[0];
        int n=nums.length;
        if(n>1){
            dp[1]=Math.max(nums[1],nums[0]);
        }
        for(int i=2;i<n;i++){
            dp[i]=Math.max(nums[i] + dp[i-2],dp[i-1]);
        }
        return dp[n-1];
        
        // Arrays.fill(dp,-1);
        // return loot(0,nums,dp);

    }
    // int loot(int i,int[] nums,int[] dp){
    //     if(i>=nums.length) return 0;
    //     if(dp[i]!=-1) return dp[i];
    //     int take=nums[i] +loot(i+2,nums,dp);
    //     int skip=loot(i+1,nums,dp);
    //     int ans=Math.max(take,skip);
    //     dp[i]=ans;
    //     return ans;
    // }
}