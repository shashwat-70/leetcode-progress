class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans=nge(temperatures);
        for(int i=0;i<ans.length;i++){
            if(ans[i]==-1)  ans[i]=0;
            else    ans[i]-=i;
        }
        return ans;
    }
    public static int[] nge(int[] arr){
        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.isEmpty())    ans[i]=-1;
            else    ans[i]=st.peek();
            st.push(i);
        }
        return ans;
    }
}