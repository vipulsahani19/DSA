class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int max =(n-1)*Math.min(height[0],height[n-1]);
        int l=0;
        int r=n-1;
        while(l<r){
            int currmax=(r-l)*Math.min(height[l],height[r]);
            max=Math.max(max,currmax);
            if(height[l]>height[r]){
                r--;
            }else{
                l++;
            }
        }
        return max;
    }
}