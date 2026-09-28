class Solution {
        static int sqrSum(int n){
            int ans=0;
            while(n!=0){
                int r=n%10;
                ans+=r*r;
                n/=10;
            }
            return ans;
        }
    public boolean isHappy(int n) {
        int slow=n,fast=n;
        do{
            slow=sqrSum(slow);
            fast=sqrSum(sqrSum(fast));
        }while(slow!=fast);
        return slow==1;
    }
}