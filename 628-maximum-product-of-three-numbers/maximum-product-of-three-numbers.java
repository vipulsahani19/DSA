class Solution {
    public int maximumProduct(int[] nums) {
        int min1=10000,min2=10000;
        int max1=-10000,max2=-10000,max3=-10000;
        for(int i=0;i<nums.length;i++){
            if(max1<=nums[i]){
                max3=max2;
                max2=max1;
                max1=nums[i];
            }else if(nums[i]>=max2){
                max3=max2;
                max2=nums[i];
            }else if(nums[i]>=max3){
                max3=nums[i];
            }
            if(nums[i]<=min1){
                min2=min1;
                min1=nums[i];
            }else if(nums[i]<=min2){
                min2=nums[i];
            }
        }return Math.max((max1*max2*max3),(max1*min1*min2));
    }
}