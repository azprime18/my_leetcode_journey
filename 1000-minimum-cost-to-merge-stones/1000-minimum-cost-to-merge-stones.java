class Solution {

    int[][] dp;

    public int mergeStones(int[] stones, int k) {
        int n = stones.length;

        // Agar ek pile banana hi possible nahi hai
        if ((n - 1) % (k - 1) != 0) return -1;

        dp = new int[n][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        // Prefix Sum
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + stones[i];
        }

        return solve(stones, prefix, 0, n - 1, k);
    }

    private int solve(int[] stones, int[] prefix, int i, int j, int k) {

        if (i == j) return 0;

        if (dp[i][j] != -1) return dp[i][j];

        int ans = Integer.MAX_VALUE;

        // Split only by (k-1)
        for (int mid = i; mid < j; mid += (k - 1)) {
            ans = Math.min(ans,
                    solve(stones, prefix, i, mid, k)
                  + solve(stones, prefix, mid + 1, j, k));
        }

        // Agar ye interval ek pile ban sakta hai
        if ((j - i) % (k - 1) == 0) {
            ans += prefix[j + 1] - prefix[i];
        }

        return dp[i][j] = ans;
    }
}