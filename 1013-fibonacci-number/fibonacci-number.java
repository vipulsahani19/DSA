class Solution {
    int helper(int n,int[] arr){
        if(n<=1) return n;
        if(arr[n]!=0) return arr[n];
        int ans=helper(n-1,arr)+helper(n-2,arr);
        arr[n]=ans;
        return ans;
    }
    public int fib(int n) {
        int[] arr=new int [n+1];
        
        return helper(n,arr);
    }
}