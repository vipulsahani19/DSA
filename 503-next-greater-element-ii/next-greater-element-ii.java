class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n*2];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        Stack<Integer> st=new Stack<>();
        st.push(nums[n-1]);
        int j=n-1;
        for(int i=ans.length-2;i>=0;i--){
            while(st.size()>0 && ans[i]>=st.peek()){
                st.pop();
            }
            if(st.size()>0){
                nums[i%n]=st.peek();
                st.push(ans[i]);
            }
            else{
                nums[i%n]=-1;
                st.push(ans[i]);
            }
        }
        return nums;
    }
}