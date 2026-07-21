class Solution {
    
    public int[] separateDigits(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]>9){
                int m=nums[i];
                ArrayList<Integer> temp=new ArrayList<>();
                while(m>0){
                   temp.add(m%10);
                   m/=10; 
                }
                 for (int j = temp.size() - 1; j >= 0; j--) {
                        ans.add(temp.get(j));
                    }
            }else ans.add(nums[i]);
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}