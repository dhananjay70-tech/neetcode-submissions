class Solution {
    int  DFS(int [][]grid , int i , int j ,int cnt){
       if(i<0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j]==0)     return cnt;

       grid[i][j]= 0 ;
       cnt++;
      cnt= DFS(grid,i+1,j,cnt);
      cnt= DFS(grid,i-1,j,cnt) ;
      cnt= DFS(grid,i,j+1,cnt) ;
      cnt= DFS(grid,i,j-1,cnt);


       return cnt;
    }
    public int maxAreaOfIsland(int[][] grid) {
       int ans = 0 ;
       for(int i = 0 ; i < grid.length ; i++){
        
        for(int j =0 ; j < grid[0].length ; j++){
            if(grid[i][j]==1){
             int area =   DFS(grid,i,j,0);
             
                ans=Math.max(area,ans);

            }
           

        }
       } 
       return ans ;
    }
}
