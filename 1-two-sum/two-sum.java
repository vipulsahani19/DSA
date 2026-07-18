class Solution {
    // submit
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(mp.containsKey(target-num)){
                return new int[] {i,mp.get(target-num)};
            }
            mp.put(num,i);
        }
        return new int[]{};
    }
}