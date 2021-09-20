class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int row=0;
        for(int i=0;i<n;i++)
        {
            if(target >= matrix[i][0] && target <= matrix[i][m-1])
                row = i;
        }
        boolean des=false;
        for(int j= 0;j<m;j++)
        {
            if(target == matrix[row][j])
                 des = true;
        }
        return des;    
    }
}