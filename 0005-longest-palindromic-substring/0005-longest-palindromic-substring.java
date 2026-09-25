class Solution {
    public String longestPalindrome(String s) {
        int max=1;
        int Low=0;
        int High=0;
        for(int i=0;i<s.length();i++){
            int l=i;
            int h=i+1;
            while(l>=0 && h<s.length() && s.charAt(l)==s.charAt(h)){
                if(h-l+1>max){
                    max=h-l+1;
                    Low=l;
                    High=h;
                }
                l--;
                h++;
            }
            l=i-1;
            h=i+1;
            while(l>=0 && h<s.length() && s.charAt(l)==s.charAt(h)){
                if(h-l+1>max){
                    max=h-l+1;
                    Low=l;
                    High=h;
                }
                l--;
                h++;
            }
        }
        return s.substring(Low,High+1);
    }
}