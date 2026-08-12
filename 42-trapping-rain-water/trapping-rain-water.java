class Solution {
    public int trap(int[] height) {
        // int n=height.length;
        // int[] leftmax=new int[n];
        // int[] rightmax=new int[n];
        // int max=height[0];
        // leftmax[0]=height[0];
        // for(int i=1;i<n;i++){
        //     if(height[i]>max) max=height[i];
        //     leftmax[i]=max;
        // }
        // max=height[n-1];
        // rightmax[n-1]=height[n-1];
        // for(int i=n-2;i>=0;i--){
        //     if(height[i]>max) max=height[i];
        //     rightmax[i]=max;
        // }
        // int water=0;
        // for(int i=0;i<height.length;i++){
        //     water+=(Math.min(leftmax[i],rightmax[i])-height[i]);
        // }
        // return water;
        int lmax=0,rmax=0,total=0;
        int l=0;
        int r=height.length-1;
        while(l<r){
            lmax=Math.max(lmax,height[l]);
            rmax=Math.max(rmax,height[r]);
            if(lmax<rmax){
                total+=lmax-height[l];
                l++;
            }else{
                total+=rmax-height[r];
                r--;
            }
        }
        return total;
    }
}