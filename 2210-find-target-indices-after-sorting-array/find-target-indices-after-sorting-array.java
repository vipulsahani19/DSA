class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {    
        int less=0;
        int equal=0;
        for(int e:nums){
            if(e<target)less++;
            else if(e==target) equal++;
        }
        
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<equal;i++){
            ans.add(less+i);
        }
        return ans;
    }
}