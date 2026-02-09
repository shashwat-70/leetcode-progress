class Solution {
    public boolean isTrionic(int[] nums) {
        int i=0;
        int a=0,b=0;
        while(nums[i]<nums[i+1]){
            i++;
            a++;
            if(i==nums.length-1){
                return false;
            }
        }
        while(nums[i]>nums[i+1]){
            i++;
            b++;
            if(i==nums.length-1){
                return false;
            }
        }
        while(nums[i]<nums[i+1]){
            i++;
            if(i==nums.length-1){
                if(a>0 && b>0){
                    return true;
                }
                break;
            }
        }
        return false;
    }
}