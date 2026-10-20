class Solution {
    public int sumOfSquares(int[] nums) {
        int ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int j=i+1;
            if(n%j==0){
                ans+=(nums[i]*nums[i]);
            }
        }
        return ans;
    }
}