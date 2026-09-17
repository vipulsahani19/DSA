class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=candies[0];
        for(int i=1;i<candies.length;i++){
            if(candies[i]>max) max=candies[i];
        }
        ArrayList<Boolean> ans=new ArrayList<>();
        for(int e:candies){
            if(extraCandies+e>=max) ans.add(true);
            else ans.add(false);
        }
        return ans;
    }
}