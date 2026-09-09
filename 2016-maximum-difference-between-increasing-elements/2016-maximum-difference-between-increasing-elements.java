class Solution {
    public int maximumDifference(int[] nums) {
        int min=0;
        int ans=-1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[min]>ans){
                ans=nums[i]-nums[min];
            }
            if(nums[min]>nums[i]){
                min=i;
            }
        }
        return ans==0? -1:ans;
    }
}