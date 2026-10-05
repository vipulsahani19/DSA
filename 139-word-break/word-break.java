class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<wordDict.size();i++){
            set.add(wordDict.get(i));
        }
        Boolean[] dp=new Boolean[s.length()];
        return helper(0,s,set,dp);
    }
    boolean helper(int idx,String s,HashSet<String> set,Boolean[] dp){
        if(idx>=s.length()) return true;
        if(dp[idx] !=null) return dp[idx];
        for(int i=idx+1;i<=s.length();i++){
            String sub=s.substring(idx,i);
            if(set.contains(sub) && helper(i,s,set,dp)){
                return dp[idx]=true;
            }
        } 
        return dp[idx]=false;
    }
}