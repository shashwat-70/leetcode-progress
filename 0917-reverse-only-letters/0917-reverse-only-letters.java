class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr=s.toCharArray();
        int l=0;
        int h=arr.length-1;
        while(l<h){
            if(isAlpha(arr[l]) && isAlpha(arr[h])){
                char temp=arr[l];
                arr[l]=arr[h];
                arr[h]=temp;
                l++;
                h--;
            }
            else if(!isAlpha(arr[l]) && isAlpha(arr[h])){
                l++;
            }
            else if(isAlpha(arr[l]) && !isAlpha(arr[h])){
                h--;
            }
            else{
                l++;
                h--;
            }
        }
        return new String(arr);
    }
    private static boolean isAlpha(char c){
        return (c>='a' && c<='z') || (c>='A' && c<='Z');
    }
}