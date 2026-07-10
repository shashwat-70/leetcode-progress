class Solution {
    public int largestRectangleArea(int[] heights){
        Stack<Integer> st=new Stack<>();
        int area=0;
        for(int i=0;i<heights.length;i++){
            int nse=i;
            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                int curr=heights[st.pop()];
                int pse=st.isEmpty()?-1:st.peek();
                int temp=curr*(nse-pse-1);
                if(temp>area){
                    area=temp;
                }
            }
            st.push(i);
        }
        int nse=heights.length;
        while(!st.isEmpty()){
            int curr=heights[st.pop()];
            int pse=st.isEmpty()?-1:st.peek();
            int temp=curr*(nse-pse-1);
            if(temp>area){
                area=temp;
            }
        }
        return area;
    }

    // public int largestRectangleArea(int[] heights) {
    //     int[] pse=pse(heights);
    //     int[] nse=nse(heights); 
    //     int ans=0;
    //     for(int i=0;i<heights.length;i++){
    //         int area=heights[i]*(nse[i]-pse[i]-1);
    //         if(area>ans){
    //             ans=area;
    //         }
    //     }
    //     return ans;
    // }

    // public static int[] pse(int[] arr){
    //     int[] ans=new int[arr.length];
    //     Stack<Integer> st=new Stack<>();

    //     for(int i=0;i<arr.length;i++){
    //         if(st.isEmpty()){
    //             ans[i]=-1;
    //             st.push(i);
    //         }
    //         else{
    //             while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
    //                 st.pop();
    //             }
    //             if(st.isEmpty()){
    //                 ans[i]=-1;
    //             }
    //             else{
    //                 ans[i]=st.peek();
    //             }
    //             st.push(i);
    //         }
    //     }
    //     return ans;
    // }

    // public static int[] nse(int[] arr){
    //     int[] ans=new int[arr.length];
    //     Stack<Integer> st=new Stack<>();

    //     for(int i=arr.length-1;i>=0;i--){
    //         if(st.isEmpty()){
    //             ans[i]=arr.length;
    //             st.push(i);
    //         }
    //         else{
    //             while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
    //                 st.pop();
    //             }
    //             if(st.isEmpty()){
    //                 ans[i]=arr.length;
    //             }
    //             else{
    //                 ans[i]=st.peek();
    //             }
    //             st.push(i);
    //         }
    //     }
    //     return ans;
    // }
}