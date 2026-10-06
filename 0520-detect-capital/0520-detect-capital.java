class Solution {
    public boolean detectCapitalUse(String word) {
        boolean firstCap=true;
        boolean allCap=true;
        boolean allSmall=true;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)>='a' && word.charAt(i)<='z'){
                allCap=false;
                if(i==0){
                    firstCap=false;
                }
            }
            else{
                allSmall=false;
                if(i!=0){
                    firstCap=false;
                }
            }
        }
        return firstCap || allCap || allSmall;
    }
}