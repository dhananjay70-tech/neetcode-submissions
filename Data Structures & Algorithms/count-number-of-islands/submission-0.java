class Solution {
     void DFS(char[][] grid,int i , int j ){
       if(i<0 || j < 0 ||i >= grid.length || j >= grid[0].length || grid[i][j]=='0') return;
       if(grid[i][j] == '0') return;
       grid[i][j]= '0';
       DFS(grid,i+1,j);
       DFS(grid,i-1,j);
       DFS(grid,i,j+1);
       DFS(grid,i,j-1);
     }
    public int numIslands(char[][] grid) {
        int cnt = 0 ;
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0; j < grid[0].length ; j++){
                if(grid[i][j]=='1'){
                    DFS(grid,i,j);
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
