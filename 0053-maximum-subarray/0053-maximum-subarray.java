class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int msum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>msum){
                msum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return msum;
    }
}