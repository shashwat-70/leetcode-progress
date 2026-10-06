class Solution {
    public int[][] imageSmoother(int[][] img) {
        int[][] ans=new int[img.length][img[0].length];
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                ans[i][j]=calcAvg(img,i,j);
            }
        }
        return ans;
    }
    private static int calcAvg(int[][] mat,int m,int n){
        int count=0;
        int sum=0;
        for(int i=m-1;i<m+2;i++){
            for(int j=n-1;j<n+2;j++){
                if(i>=0 && j>=0 && i<mat.length && j<mat[0].length){
                    sum+=mat[i][j];
                    count++;
                }  
            }
        }
        return sum/count;
    }
}