class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();

        for(int i =0 ;i<matrix.length;i++){
            for(int j =0 ;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row.add(j);
                    col.add(i);
                }
            }
        }

        for(int i : row){
            rowzero(matrix,i);
        }
        for(int j : col){
            colzero(matrix,j);
        }
    }

    public static void rowzero(int[][] arr, int i){
        for(int[] a : arr ){
            a[i]=0;
        }
    }
    public static void colzero(int[][] arr, int j){
        for(int a=0;a<arr[0].length;a++){
            arr[j][a]=0;
        }
    }
}