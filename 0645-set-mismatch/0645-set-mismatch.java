class Solution {
    public int[] findErrorNums(int[] nums) {
        sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return new int[] {nums[i],i+1};
            }
        }
        return new int[] {-1,-1};
    }
    void sort(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]==nums[correct]){
                i++;
            }
            else{
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
        }
    }
}