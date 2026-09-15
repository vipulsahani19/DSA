class Solution {
    public int lengthOfLIS(int[] arr) {
        int n=arr.length;
        // int[][] dp=new int[n][n+1];
        int[] dp=new int[n];
        int ans=0;
        for(int i=0;i<n;i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            ans=Math.max(ans,dp[i]);
        }
        return ans;
        // for(int i=0;i<n;i++){
        //     Arrays.fill(dp[i],-1);
        // }
        // return helper(0,-1,arr,dp);
    }
    int helper(int idx,int prevs,int[] arr,int[][] dp){
        if(idx==arr.length) return 0;
        if(dp[idx][prevs+1]!=-1) return dp[idx][prevs+1];
        int skip=helper(idx+1,prevs,arr,dp);
        if(prevs!=-1 && arr[idx]<=arr[prevs])return dp[idx][prevs+1]= skip;
        int pick=1+helper(idx+1,idx,arr,dp);
        return dp[idx][prevs+1]= Math.max(skip,pick);
    }

}