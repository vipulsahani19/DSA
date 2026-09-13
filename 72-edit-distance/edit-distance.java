class Solution {
    public int minDistance(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int[][] dp=new int [n][m];
        // for(int i=0;i<n;i++) Arrays.fill(dp[i],-1);
        return helper(n-1,m-1,s1,s2,dp);
    }
    int helper(int i,int j,String s1,String s2,int[][] dp){
        if(j<0) return i+1;
        if(i<0) return j+1;
        if(s1.charAt(i)==s2.charAt(j)){
            return helper(i-1,j-1,s1,s2,dp);
        }
        if(dp[i][j]!=0) return dp[i][j];
        // replace
        int replace=1+helper(i-1,j-1,s1,s2,dp);
        // remove 
        int remove=1+helper(i-1,j,s1,s2,dp);
        // insert
        int insert=1+helper(i,j-1,s1,s2,dp);

        return dp[i][j]= Math.min(replace,Math.min(remove,insert));
    }
}