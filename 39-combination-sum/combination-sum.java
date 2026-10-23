class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        AnsList(0,arr,target,new ArrayList<>(),ans);
        return ans;
    }
    void AnsList(int st,int[] arr,int target,List<Integer> a,List<List<Integer>> ans){
        if(target<0) return;
        if(target==0){
            ans.add(new ArrayList<>(a));
            return;
        }

        for(int i=st;i<arr.length;i++){
            // if(arr[i]>target) break;
            a.add(arr[i]);
            AnsList(i,arr,target-arr[i],a,ans);
            a.remove(a.size()-1);
        }
    }
}