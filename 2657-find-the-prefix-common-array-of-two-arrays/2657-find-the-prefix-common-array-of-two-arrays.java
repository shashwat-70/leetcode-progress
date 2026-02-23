class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int[] freq=new int[n];
        int[] ans=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            freq[A[i]-1]++;
            freq[B[i]-1]++;
            if(freq[A[i]-1]>1)  count++;
            if(freq[B[i]-1]>1 && A[i]!=B[i])  count++;
            ans[i]=count;
        }
        return ans;
    }
}