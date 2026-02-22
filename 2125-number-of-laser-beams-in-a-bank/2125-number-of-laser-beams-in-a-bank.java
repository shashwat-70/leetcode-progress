class Solution {
    public int numberOfBeams(String[] bank) {
        int result=0;
        int count2=0;
        for(int i=0;i<bank.length;i++){
            int count=0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1'){
                    count++;
                }
            }
            result+=count*count2;
            if(count!=0)    count2=count;
        }
        return result;
    }
}