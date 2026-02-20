class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] num=new int[2*n];
        for(int i=0;i<n;i++){
            num[i*2]=nums[i];
            num[i*2+1]=nums[i+n];
        }
        return num;
    }
}