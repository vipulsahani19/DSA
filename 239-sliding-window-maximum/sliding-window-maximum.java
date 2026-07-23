class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        if(n==0) return nums;
        ArrayList<Integer> ans=new ArrayList<>();
        Deque<Integer> q = new ArrayDeque<>();
        for(int i=0;i<k;i++){
            while(q.size()>0 && nums[i]>=nums[q.peekLast()]){
                q.removeLast();
            }q.addLast(i);
        }
        ans.add(nums[q.peekFirst()]);
        for(int i=k;i<nums.length;i++){
            while(q.size()>0 && q.peekFirst()<=i-k){
                q.removeFirst();
            }
            while(q.size()>0 && nums[i]>=nums[q.peekLast()]){
                q.removeLast();
            }q.addLast(i);
            ans.add(nums[q.peekFirst()]);
        }return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}