class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int h=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        int curr=0;

        while(h<nums.length){
            sum+=nums[h];
            curr++;
            h++;
            if(sum>=target){ 
                while(sum>=target){
                    if(curr<min){
                        min=curr;
                    }
                    sum-=nums[l];
                    l++;
                    curr--;
                }
            }
        }

        return min==Integer.MAX_VALUE? 0:min;
    }
}