class Solution {

    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[] t1 = new int[r];
        int[] t2 = new int[c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(matrix[i][j] == 0)
                {
                    t1[i]=1;
                    t2[j]=1;
                }

            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(t1[i] == 1 || t2[j] == 1)
                {
                    matrix[i][j] = 0;
                }
            }
        }

        
        
    }
}