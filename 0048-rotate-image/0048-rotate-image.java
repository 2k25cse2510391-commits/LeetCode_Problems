class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        flip(matrix);
    }

    public static void flip(int[][] mat){
        for(int x =0; x < mat.length;x++){
            for(int y =0;y<mat.length/2;y++){
                int temp=mat[x][y];
                mat[x][y]=mat[x][-y+(mat.length-1)];
                mat[x][-y+(mat.length-1)]=temp;
            }
        }
    }

    public static void transpose(int[][] mat){
        for(int x =0;x<mat.length;x++){
            for(int y = 0;y<mat.length;y++){
                if(x>y){
                    continue;
                }
                else{
                    swap(mat,x,y);
                }
            }
        }
    }
    public static void swap(int[][] arr, int x , int y){
        int temp= arr[x][y];
        arr[x][y]=arr[y][x];
        arr[y][x]=temp;
    }
}