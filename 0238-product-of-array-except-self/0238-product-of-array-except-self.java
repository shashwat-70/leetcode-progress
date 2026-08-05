class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr=new int[nums.length];
        int pro=1;
        for(int i=0;i<arr.length;i++){
            int temp=nums[i];
            arr[i]=pro;
            pro*=temp;
        }
        pro=1;
        for(int i=arr.length-1;i>=0;i--){
            int temp=nums[i];
            nums[i]=pro;
            pro*=temp;
        }

        for(int i=0;i<arr.length;i++){
            nums[i]=nums[i]*arr[i];
        }
        return nums;
    }
}