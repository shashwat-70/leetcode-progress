class Solution {
    public int trap(int[] height) {
        int[] pMax=new int[height.length];
        int[] sMax=new int[height.length];
        int temp1=0;
        int temp2=0;
        int ans=0;

        for(int i=0;i<height.length;i++){
            if(temp1<height[i]){
                temp1=height[i];
            }
            pMax[i]=temp1;

            if(temp2<height[height.length-1-i]){
                temp2=height[height.length-1-i];
            }
            sMax[height.length-1-i]=temp2;
        }

        for(int i=0;i<height.length;i++){
            if(height[i]<pMax[i] && height[i]<sMax[i]){
                ans+=Math.min(pMax[i],sMax[i])-height[i];
            }
        }
        return ans;
    }
}