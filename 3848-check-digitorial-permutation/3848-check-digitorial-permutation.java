class Solution {
    public boolean isDigitorialPermutation(int n) {
        int result=0;
        int temp=n;
        while(n>0){
            int temp1=n%10;
            n/=10;
            result+=fact(temp1);
        }
        return checkpermutation(result,temp);
    }
    boolean checkpermutation(int a,int b){
        int[] arr1=new int[10];
        int[] arr2=new int[10];
        int a1=a;
        int b1=b;
        while(a>0){
            int temp1=a%10;
            a/=10;
            arr1[temp1]++;
        }
        while(b>0){
            int temp1=b%10;
            b/=10;
            arr2[temp1]++;
        }
        a=a1;
        b=b1;
        while(a>0){
            int temp1=a%10;
            a/=10;
            if(arr1[temp1]!=arr2[temp1])    return false;
        }
        while(b>0){
            int temp1=b%10;
            b/=10;
            if(arr1[temp1]!=arr2[temp1])    return false;
        }
        return true;
        
    }
    int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        int result=1;
        for(int i=2;i<=n;i++){
            result*=i;
        }
        return result;
    }
}