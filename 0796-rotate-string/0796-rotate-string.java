class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        s=s+s;
        int l=0;
        int h=0;
        int i=0;
        while(h<s.length()){
            if(s.charAt(h)==goal.charAt(i)){
                h++;
                i++;
                if(i==goal.length()){
                    return true;
                }
            }
            else{
                while(s.charAt(l)!=goal.charAt(0)){
                    l++;
                    if(l>=s.length()){
                        return false;
                    }
                }
                i=0;
                h=l;
                l++;
            }
        }
        return false;
    }
}