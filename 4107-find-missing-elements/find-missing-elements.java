class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max=nums[0],min=nums[0];
        set.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            set.add(nums[i]);
            if(nums[i]>max) max=nums[i];
            if(nums[i]<min) min=nums[i];
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=min+1;i<max;i++){
            if(!set.contains(i)) ans.add(i);
        }
        return ans;
    }
}