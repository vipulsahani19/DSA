class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(nums,0,new ArrayList<>(),ans);
        return ans;
    }
    void helper(int[] nums,int idx,List<Integer> a,List<List<Integer>> ans){
        if(idx==nums.length){
            ans.add(new ArrayList<>(a));
            return;
        }
        a.add(nums[idx]);
        helper(nums,idx+1,a,ans);
        a.remove(a.size()-1);
        helper(nums,idx+1,a,ans);
    }
}