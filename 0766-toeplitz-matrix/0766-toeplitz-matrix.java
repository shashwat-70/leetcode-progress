class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=0;i<matrix[0].length;i++){
            int e=matrix[0][i];
            int m=0;
            int n=i;
            while(m<matrix.length && n<matrix[0].length){
                if(matrix[m][n]!=e){
                    return false;
                }
                m++;
                n++;
            }
        }
        for(int i=1;i<matrix.length;i++){
            int e=matrix[i][0];
            int m=i;
            int n=0;
            while(m<matrix.length && n<matrix[0].length){
                if(matrix[m][n]!=e){
                    return false;
                }
                m++;
                n++;
            }
        }
        return true;
    }
}