class Solution {
    public int countDigits(int num) {
        return count(num);
    }
    static int count(int num){
        int count=0;
        int temp=num;
        while(temp>0){
            int temp1=temp%10;
            temp/=10;
            if(num%temp1==0){
                count++;
            }
        }
        return count;
    }
}