class Solution {
    static int rev(int n){
        int ans =0;
        while(n>0){
            ans*=10;
            ans+=n%10;
            n/=10;
        }return ans;
    }
    public int alternateDigitSum(int n) {
        int ans=0;
        int m=rev(n);
        int count=1;
        while(m>0){
            int r=m%10;
            if(count%2==1){
                ans+=r;
            }else{
                ans-=r;
            }count++;
            m/=10;
        }return ans;
    }
}