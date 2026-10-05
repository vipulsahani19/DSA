class Solution {
    public int calculateMinimumHP(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++) Arrays.fill(dp[i],-1);
        return helper(0,0,arr,dp);
    }
    int helper(int i,int j,int[][] arr,int[][] dp){
        if(i>=arr.length || j>=arr[0].length) return Integer.MAX_VALUE;
        if (i == arr.length - 1 && j == arr[0].length - 1) {
            return Math.max(1, 1 - arr[i][j]);
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int right=helper(i,j+1,arr,dp);
        int down=helper(i+1,j,arr,dp);

        int need = Math.min(right, down) - arr[i][j];

        return dp[i][j]= Math.max(1, need);
    }
}