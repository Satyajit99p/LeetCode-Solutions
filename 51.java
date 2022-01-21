class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        putQueens(board,ans,0);
        return ans;
        
    }
    
    public void putQueens(char[][] board, List<List<String>> ans, int col )
    {
        if(col == board.length)
        {            
            List<String> b = new ArrayList<>();
            for(int i = 0;i < board.length;i++)
            {
                String row = "";
                for(int j=0;j<board.length;j++)
                {
                    if(board[i][j] == 'Q')
                        row += 'Q';
                    else
                        row += '.';
                }
                b.add(row);
            }
            ans.add(b);
            return;
        }
        
        else
        {
            for(int row = 0;row<board.length;row++)
            {
                if(boardStable(row,col,board))
                {
                    board[row][col] = 'Q';
                    putQueens(board,ans,col+1);
                    board[row][col] = '.';
                    
                }
            }
        }
    }
    
    public boolean boardStable(int row,int col, char[][] board)
    {
        //horizontal
        for(int j=0; j<board.length; j++) {
           if(board[row][j] == 'Q') {
               return false;
           }
       }
      
       //vertical
       for(int i=0; i<board.length; i++) {
           if(board[i][col] == 'Q') {
               return false;
           }
       }
      
       //upper left
       int r = row;
       for(int c=col; c>=0 && r>=0; c--, r--) {
           if(board[r][c] == 'Q') {
               return false;
           }
       }
      
       //upper right
       r = row;
       for(int c=col; c<board.length && r>=0; r--, c++) {
           if(board[r][c] == 'Q') {
               return false;
           }
       }
      
       //lower left
       r = row;
       for(int c=col; c>=0 && r<board.length; r++, c--) {
           if(board[r][c] == 'Q') {
               return false;
           }
       }
      
       //lower right
       for(int c=col; c<board.length && r<board.length; c++, r++) {
           if(board[r][c] == 'Q') {
               return false;
           }
       }
      
       return true;
    }
}