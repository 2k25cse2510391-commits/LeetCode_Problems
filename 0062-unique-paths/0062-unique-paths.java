class Solution {
    public int uniquePaths(int m, int n) {
        
        return trav(0,0,new int[n][m]);
    }

    public static int trav(int n, int m,int[][] arr){
        if(n==arr.length-1 && m==arr[0].length-1){
            return 1;
        }

        if(n>=arr.length || m>=arr[0].length){
            return 0;
        }
        if(arr[n][m]!=0){
            return arr[n][m];
        }
       arr[n][m] =  trav(n+1,m,arr)+trav(n,m+1,arr);
        
        return arr[n][m];
        
    }
}