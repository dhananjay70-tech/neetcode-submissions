class Solution {
    public boolean isValidSudoku(char[][] board) {
       int m = board.length;
       int n = board[0].length;
      HashSet<String>set = new HashSet<>();

      for(int i = 0 ; i < m ; i++){
        for(int j = 0 ; j < n ; j++){

                            if (board[i][j] == '.') {
                    continue;
                }

            char cell = board[i][j];
              String row = cell+ "row" + i;
                String col = cell+ "col" + j;
                String box =cell  + "box" + (i / 3) + (j / 3);

           if(set.contains(row) || set.contains(col) || set.contains(box)){
                return false;
            }
            set.add(row);
            set.add(col);
            set.add(box);
  }
      }
        return true;
    }
}
