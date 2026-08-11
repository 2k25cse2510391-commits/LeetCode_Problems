class Solution {
    public int climbStairs(int n) {
        return countt(0,new int[n+1]);
    }

    public static int countt(int n, int[] arr) {
        if(n>=arr.length){return 0;}

        if(n==arr.length-1){
            return 1;
        }

        if(arr[n]!=0){
            return arr[n];
        }

        int sum = countt(n+1,arr)+countt(n+2,arr);
        arr[n]=sum;
        return sum;
    }
}