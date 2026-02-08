class Solution {
    public int totalNQueens(int n) {
        boolean[][] maze=new boolean[n][n];
        return Nqueen(maze,0);
    }
    static int Nqueen(boolean[][] maze,int r){
        if(r==maze.length){
            return 1;
        }
        int count=0;
        for(int i=0;i<maze[0].length;i++){
            if(isSafe(maze,r,i)){
                maze[r][i]=true;
                count+=Nqueen(maze,r+1);
                maze[r][i]=false;
            }
        }
        return count;
    }
    static boolean isSafe(boolean[][] maze,int r,int c){
        for(int i=0;i<r;i++){
            if(maze[i][c]){
                return false;
            }
        }
        for(int i=r-1,j=c-1;i>=0 && j>=0;i--,j--){
            if(maze[i][j]){
                return false;
            }
        }
        for(int i=r-1,j=c+1;i>=0 && j<maze[0].length;i--,j++){
            if(maze[i][j]){
                return false;
            }
        }
        return true;
    }
}