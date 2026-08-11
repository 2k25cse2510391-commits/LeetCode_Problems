class Solution {
    public int numTrees(int n) {
        int[] memo = new int[n + 1];
        return bin_tree(n, memo);
    }

    private int bin_tree(int n, int[] memo) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (memo[n] != 0) {
            return memo[n];
        }

        int sum = 0;
        for (int a = 0; a < n; a++) {
            sum += bin_tree(a, memo) * bin_tree(n - a - 1, memo);
        }

        memo[n] = sum;
        return sum;
    }
}