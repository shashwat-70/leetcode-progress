class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0;
        int h=k-1;

        int sum=0;
        for(int i=0;i<=h;i++)   sum+=nums[i];
        
        int max=sum;
        while(h<nums.length-1){
            l++;
            h++;
            sum=sum-nums[l-1]+nums[h];
            if(sum>max) max=sum;
        }

        return (double)max/k;
    }
}