class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c!=mat.length*mat[0].length){
            return mat;
        }
        int[][] ans=new int[r][c];
        int m=0;
        int n=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                ans[m/c][n%c]=mat[i][j];
                m++;
                n++;
            }
        }
        return ans;
    }
}