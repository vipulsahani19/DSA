class Solution {
    int convertBinary(int a) {
        int binary = 0;
        int place = 1;

        while (a > 0) {
            int x = a % 2;
            binary += x * place;
            place *= 10;
            a /= 2;
        }

        return binary;
    }
    int countOnes(int n){
        int ans=0;
        while(n>0){
            if(n%10==1) ans++;
            n/=10;
        }
        return ans;
    }
    public int calculateScore(int a, int b) {
        int s1=convertBinary(a);
        int s2=convertBinary(b);
        s1=countOnes(s1);
        s2=countOnes(s2);
        if(s1>=s2) return s1*s2;
        return s2/s1;
    }
}