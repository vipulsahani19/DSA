class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> a =new ArrayList<>();
        solve(1,n,k,a,ans);
        return ans;
    }
    void solve(int st,int n,int k,List<Integer> a,List<List<Integer>> ans){
        if(a.size()==k){
            ans.add(new ArrayList<>(a));
            return;
        }
        for(int i=st;i<=n;i++){
            a.add(i);
            solve(i+1,n,k,a,ans);
            a.remove(a.size()-1);
        }
    }
}