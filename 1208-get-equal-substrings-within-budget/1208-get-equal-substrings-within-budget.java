class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int curr=0;
        int max=0;
        int currCost=0;
        int l=0;
        int h=0;
        while(h<s.length()){
            currCost+=Math.abs(s.charAt(h)-t.charAt(h));
            while(currCost>maxCost && l<=h){
                currCost-=Math.abs(s.charAt(l)-t.charAt(l));
                l++;
            }
            curr = h-l+1;
            if(curr>max){
                max=curr;
            }
            h++;
        }
        return max;
    }
}