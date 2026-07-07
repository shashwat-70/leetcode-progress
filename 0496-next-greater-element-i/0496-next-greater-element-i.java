class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans2=NGE(nums2);
        int[] ans=new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    ans[i]=ans2[j];
                }
            }
        }
        
        return ans;
    }
    public int[] NGE(int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[arr.length];
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