class Solution {
    int convertBinary(int a) {
        int binary = 0;
        int place = 1;
        int ans=0;
        while (a > 0) {
            int x = a % 2;
            if(x==1) ans++;
            binary += x * place;
            place *= 10;
            a /= 2;
        }

        return ans;
    }
    public int calculateScore(int a, int b) {
        int s1=Integer.bitCount(a);
        int s2=Integer.bitCount(b);
        if(s1>=s2) return s1*s2;
        return s2/s1;
    }
}