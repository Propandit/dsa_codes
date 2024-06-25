public class wordsearch {
        public boolean exist(char[][] board, String word) {\


            char [3][4]board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]]
            char word = "ABCCED"
        for (int i = 0; i < board.length; ++i)
            for (int j = 0; j < board[0].length; ++j)
            if (dfs(board, word, i, j, 0))
                return true;
        return false;
        }
    
        private boolean dfs(char[][] board, String word, int i, int j, int s) {
        if (i < 0 || i == board.length || j < 0 || j == board[0].length)
            return false;
        if (board[i][j] != word.charAt(s) || board[i][j] == '*')
            return false;
        if (s == word.length() - 1)
            return true;
    
        final char cache = board[i][j];
        board[i][j] = '*';
          final boolean isExist = dfs(board, word, i + 1, j, s + 1) || //
                                  dfs(board, word, i - 1, j, s + 1) || //
                                  dfs(board, word, i, j + 1, s + 1) || //
                                dfs(board, word, i, j - 1, s + 1);
        board[i][j] = cache;
    
        return isExist;
        }
    }

