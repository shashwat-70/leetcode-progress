class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans=new ArrayList<Integer>();
        for(int i=0;i<matrix.length;i++){
            int min=matrix[i][0];
            int idx=0;
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    idx=j;
                }
            }

            int max=matrix[0][idx];
            for(int j=1;j<matrix.length;j++){
                if(matrix[j][idx]>max){
                    max=matrix[j][idx];
                }
            }

            if(min==max){
                ans.add(min);
            }
        }

        return ans;

    }
}