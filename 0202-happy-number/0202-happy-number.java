class Solution {
    public boolean isHappy(int n) {
        int s=n;
        int f=n;
        do{
            if(f==1){
                return true;
            }
            s=calc(s);
            f=calc(calc(f));
        }while(s!=f);
        return s==1;
    }
    static int calc(int n){
        int ans=0;
        while(n!=0){
            int temp=(n%10)*(n%10);
            ans+=temp;
            n/=10;
        }
        return ans;
    }
}