class Solution {
    public int maxArea(int[] height) {
        int s=0;
        int e=height.length-1;
        int max=0;
        while(s<e){
            int area=Math.min(height[s],height[e])*(e-s);
            if(area>max){
                max=area;
            }
            if(height[s]<height[e]){
                s++;
            }
            else{
                e--;
            }
        }
        return max;
    }
}