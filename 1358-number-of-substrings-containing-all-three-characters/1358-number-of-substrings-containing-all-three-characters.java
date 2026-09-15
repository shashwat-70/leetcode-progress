class Solution {
    public int numberOfSubstrings(String s) {
        int[] count=new int[3];
        int l=0;
        int h=0;
        int c=0;
        while(h<s.length()){
            count[s.charAt(h)-'a']++;
            if(count[0]>0 && count[1]>0 && count[2]>0){
                while(count[0]>0 && count[1]>0 && count[2]>0){
                    count[s.charAt(l)-'a']--;
                    l++;
                    c+=s.length()-h;
                }
            }
            h++;
        }
        return c;
    }
}