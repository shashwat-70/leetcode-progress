class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        for(int i=0;i<matrix.length;i++){
            int s=0;
            int e=matrix[0].length-1;
            while(s<e){
                int temp=matrix[i][s];
                matrix[i][s]=matrix[i][e];
                matrix[i][e]=temp;
                s++;
                e--;
            }
        }
        
    }
    public static void transpose(int[][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=i;j<mat[0].length;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
    }
}