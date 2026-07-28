class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int left=0;
        int total=0;
        for(int i=0;i<n;i++){
            total+=nums[i];
        }for(int i=0;i<n;i++){
            int rigth=total-left-nums[i];
            if(rigth==left) return i;
            left+=nums[i];
        }
        return -1;
    }
}