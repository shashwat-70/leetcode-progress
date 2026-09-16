class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0;
        int h=k-1;
        int min=Integer.MAX_VALUE;
        for(h=h;h<nums.length;h++,l++){
            int diff=nums[h]-nums[l];
            if(diff<min)    min=diff;
        }
        return min;
    }
}