class Solution {
    public int[] nextGreaterElements(int[] nums) {
        return NGE(nums);
    }
    public int[] NGE(int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            if(st.isEmpty()){
                st.push(arr[i]);
            }
            else if(st.peek()>arr[i]){
                st.push(arr[i]);
            }
            else{
                while(!st.isEmpty() && st.peek()<=arr[i]){
                    st.pop();
                }
                st.push(arr[i]);
            }
        }

        for(int i=arr.length-1;i>=0;i--){
            if(st.isEmpty()){
                ans[i]=-1;
                st.push(arr[i]);
            }
            else if(st.peek()>arr[i]){
                ans[i]=st.peek();
                st.push(arr[i]);
            }
            else{
                while(!st.isEmpty() && st.peek()<=arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans[i]=-1;
                }
                else{
                    ans[i]=st.peek();
                }
                st.push(arr[i]);
            }
        }
        return ans;
    }
}