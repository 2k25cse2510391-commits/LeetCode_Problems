class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
      return Math.abs(path(0,0,obstacleGrid));
    }

    public static int path(int i , int j , int[][] mat){
        if(i>=mat.length||j>=mat[0].length||mat[i][j]==1){
            return 0;
        }

        if(i==mat.length-1 && j == mat[0].length-1){
            return -1;
        }
        if(mat[i][j]<0){
            return mat[i][j];
        }

        int sum = path(i+1,j,mat)+path(i,j+1,mat);
        mat[i][j] = sum;
        return sum;
    }
}