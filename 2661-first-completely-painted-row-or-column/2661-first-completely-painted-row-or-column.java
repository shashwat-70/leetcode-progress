class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int[][] ans=position(mat);
        for(int i=0;i<arr.length;i++){
            int r=ans[arr[i]-1][0];//retrieves the row index where arr[i] is stored
            int c=ans[arr[i]-1][1];//retrieves the col index where arr[i] is stored
            mat[r][c]=0;//marks the index as painted(0)
            if(painted(mat,r,c)){//returns the current move if either a complete row or column is painted
                return i;
            }
        }
        return arr.length-1;
    }
    static int[][] position(int[][] matrix){//stores the position of each number in arr in a 2d matrix
        int[][] ans=new int[matrix.length*matrix[0].length][2];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                ans[matrix[i][j]-1][0]=i;
                ans[matrix[i][j]-1][1]=j;
            }
        }
        return ans;
    }
    static boolean painted(int[][] matrix,int r,int c){//checks if the row or col is painted
        boolean row=true;
        boolean col=true;
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][c]!=0){
                row=false;
                break;
            }
        }
        for(int i=0;i<matrix[0].length;i++){
            if(matrix[r][i]!=0){
                col=false;
                break;
            }
        }
        return row||col;
    }
}