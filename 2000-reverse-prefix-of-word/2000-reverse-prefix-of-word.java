class Solution {
    public String reversePrefix(String word, char ch) {
        int i=firstocc(word,ch);
        return rev(word,i)+word.substring(i+1);
    }
    static int firstocc(String s,char ch){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch) return i;
        }
        return -1;
    }
    static String rev(String s,int i){
        StringBuilder Sb=new StringBuilder();
        for(int j=i;j>=0;j--){
            Sb.append(s.charAt(j));
        }
        return Sb.toString();
    }
}