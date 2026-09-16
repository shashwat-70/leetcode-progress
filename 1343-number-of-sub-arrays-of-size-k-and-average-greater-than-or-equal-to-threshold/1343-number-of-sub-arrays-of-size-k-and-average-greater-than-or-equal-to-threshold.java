class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        int target=threshold*k;
        int l=0;
        int h=k-1;

        int sum=0;
        for(int i=l;i<=h;i++)   sum+=arr[i];
        if(sum>=target) count++;

        while(h<arr.length-1){
            l++;
            h++;
            sum=sum-arr[l-1]+arr[h];
            if(sum>=target) count++;
        }

        return count;
    }
}