class Solution {
    void helper(String s,Stack<Character> st){
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='#'){
                if(st.size()>0){
                    st.pop();
                }
            }else{
                st.push(ch);
            }
        }
    }
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st_1=new Stack<>();
        helper(s,st_1);
        Stack<Character> st_2=new Stack<>();
        helper(t,st_2);
        if(st_1.size()!=st_2.size()) return false;
        while(st_1.size()>0){
            if(st_1.pop()!=st_2.pop()) return false;
        }
        return true;
    }
}