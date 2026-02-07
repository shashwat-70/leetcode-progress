class Solution {
    public int getMaximumGold(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int temp=traverse(grid,0,i,j);
                if(temp>max){
                    max=temp;
                }
            }
        }
        return max;
    }
    public int traverse(int[][] grid,int gold,int r,int c){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]==0){
            return gold;
        }
        int temp=grid[r][c];
        grid[r][c]=0;
        int right=traverse(grid,temp+gold,r,c+1);//right
        int left=traverse(grid,temp+gold,r,c-1);//left
        int down=traverse(grid,temp+gold,r+1,c);//down
        int up=traverse(grid,temp+gold,r-1,c);//up
        grid[r][c]=temp;
        return Math.max(Math.max(right,left),Math.max(down,up));
    }
}