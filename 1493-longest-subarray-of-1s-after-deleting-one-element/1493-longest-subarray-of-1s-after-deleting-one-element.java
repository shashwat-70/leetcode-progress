class Solution {
    public int longestSubarray(int[] nums) {
        int l=0;
        int h=0;
        int sum=0;
        int max=0;
        int count=0;
        while(h<nums.length){
            if(nums[h]==1){
                sum++;
                if(sum>max) max=sum;
            }
            else{
                count++;
            }
            while(count>1){
                sum-=nums[l];
                if(nums[l]==0)  count--;
                l++;
            }
            h++;
        }
        return max==nums.length?max-1:max;
    }
}