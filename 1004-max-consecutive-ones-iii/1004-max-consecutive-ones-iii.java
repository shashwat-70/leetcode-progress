class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int h=0;
        int sum=0;
        int max=0;
        while(h<nums.length){
            sum+=nums[h];
            int windowsize=h-l+1;
            if(sum>=windowsize-k){
                if(sum>max) max=sum;  
            }
            else if(sum<windowsize-k){
                while(sum<windowsize-k){
                    sum-=nums[l];
                    l++;
                    windowsize=h-l+1;
                }
            }
            h++;
        }
        return max+k>nums.length?nums.length:max+k;
    }
}