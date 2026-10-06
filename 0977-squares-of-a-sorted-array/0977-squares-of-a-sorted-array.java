class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans=new int[nums.length];
        int i=nums.length-1;
        int s=0;
        int e=nums.length-1;
        while(i>=0){
            if(Math.abs(nums[s])>=Math.abs(nums[e])){
                ans[i]=nums[s]*nums[s];
                s++;
            }
            else{
                ans[i]=nums[e]*nums[e];
                e--;
            }
            i--;
        }
        return ans;
    }
}