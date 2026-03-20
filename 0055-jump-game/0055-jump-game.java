class Solution {
    public boolean canJump(int[] nums) {
        int max=0;//max reachable idx
        for(int i=0;i<nums.length;i++){
            if(i>max){//if iterating idx > max reachable idx it means iterating idx isnt reachable
                return false;
            }
            if(i+nums[i]>max){// you can go farther away than max so update max
                max=i+nums[i];
            }
            if(max>=nums.length-1){// you have reached or crossed last idx
                return true;
            }
        }
        return true;
    }
}