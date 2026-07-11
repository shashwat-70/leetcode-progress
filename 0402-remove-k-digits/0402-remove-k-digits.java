class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<num.length();i++){
            while(!st.isEmpty() && st.peek()>num.charAt(i) && k>0){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        while(k>0){
            sb.deleteCharAt(sb.length()-1);
            k--;
        }
        int i=0;
        while(i<sb.length() && sb.charAt(i)=='0'){
            i++;
        }
        sb=new StringBuilder(sb.substring(i));
        return sb.length()==0 ? "0":sb.toString();
    }
}