class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st =new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        st.push(nums2[nums2.length-1]);
        map.put(nums2[nums2.length-1],-1);
        for(int i=nums2.length-2;i>=0;i--){
            while(st.size()>0 && nums2[i]>=st.peek()){
                st.pop();
            }
            if(st.size()>0){
                map.put(nums2[i],st.peek());
                st.push(nums2[i]);
            }
            else{
                map.put(nums2[i],-1);
                st.push(nums2[i]);
            }
        }
        for(int i=0;i<nums1.length;i++){
            if (map.containsKey(nums1[i])) {
                nums1[i] = map.get(nums1[i]);
            } else {
                nums1[i] = -1; // or any default value
            }
        }
        return nums1;
    }
}