class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        boolean[] check=new boolean[nums.length];
        solve(nums,check,a,ans);
        return ans;
    }
    void solve(int[] nums,boolean[] check,List<Integer> a,List<List<Integer>> ans){
        if(a.size()==nums.length){
            List<Integer> copy=new ArrayList<>(a);
            ans.add(copy);
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!check[i]){
                check[i]=true;
                a.add(nums[i]);
                solve(nums,check,a,ans);
                check[i]=false;
                a.remove(a.size()-1);
            }
        }
    }
}