class Solution {
    public String trimTrailingVowels(String s) {
        for(int i=s.length()-1;i>=0;i--){
            if(isConsonant(s.charAt(i))){
                return s.substring(0,i+1);
            }
        }
        return "";
    }
    static boolean isConsonant(char a){
        if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u'){
            return false;
        }
        return true;
    }
}