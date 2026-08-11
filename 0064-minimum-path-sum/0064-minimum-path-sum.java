class Solution {
    public int minPathSum(int[][] grid) {
        for(int x = grid.length-1;x>=0;x--){
            for(int y = grid[0].length-1;y>=0;y--){
                if(x+1==grid.length && y+1==grid[0].length){
                    continue;
                }
                else if(y+1==grid[0].length){
                    grid[x][y]+=grid[x+1][y];
                }
                else if(x+1==grid.length){
                    grid[x][y]+=grid[x][y+1];
                }
                
                else{
                    grid[x][y]+=Math.min(grid[x][y+1],grid[x+1][y]);
                }
            }
        }
        return grid[0][0];
    }
}