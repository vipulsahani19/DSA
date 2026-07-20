class Solution {
    public int largestRectangleArea(int[] arr) {
        int n=arr.length;
        int nes[]=new int [n];
        int pse[]=new int [n];
        nes[n-1]=n;
        Stack<Integer> st=new Stack<>();
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()) nes[i]=n;
            else nes[i]=st.peek();
            st.push(i);
        }
        while(!st.isEmpty()) st.pop();
        pse[0]=-1;
        st.push(0);
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()) pse[i]=-1;
            else pse[i]=st.peek();
            st.push(i);
        }
        int max=0;
        for(int i=0;i<n;i++){
            int area=arr[i]*(nes[i]-pse[i]-1);
            max=Math.max(max,area);
        } return max;
    }
}