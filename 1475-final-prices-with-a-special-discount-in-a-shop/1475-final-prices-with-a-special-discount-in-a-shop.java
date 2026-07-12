class Solution {
    public int[] finalPrices(int[] prices) {
        int[] nse=nse(prices);
        for(int i=0;i<prices.length;i++){
            if(nse[i]!=-1){
                prices[i]-=nse[i];
            }
        }
        return prices;
    }
    public static int[] nse(int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            if(st.isEmpty()){
                ans[i]=-1;
                st.push(arr[i]);
            }
            else if(st.peek()<=arr[i]){
                ans[i]=st.peek();
                st.push(arr[i]);
            }
            else{
                while(!st.isEmpty() && st.peek()>arr[i]){
                    st.pop();
                }
                if(st.isEmpty())    ans[i]=-1;
                else    ans[i]=st.peek();
                st.push(arr[i]);
            }
        }
        return ans;
    }
} 