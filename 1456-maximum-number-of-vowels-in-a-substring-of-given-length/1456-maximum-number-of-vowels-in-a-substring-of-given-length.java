class Solution {
    public int maxVowels(String s, int k) {
        int l=0;
        int h=k-1;
        int count=0;
        for(int i=l;i<=h;i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        if(count==k) return count;

        int max=count;
        while(h<s.length()-1){
            if(isVowel(s.charAt(l)))    count--;
            if(isVowel(s.charAt(h+1)))  count++;
            if(count>max)   max=count;
            l++;
            h++;
        }

        return max;
    }

    private static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
}