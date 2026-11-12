class Solution {
    public int solve(int cost[], int dp[], int i){
        if(i < 2) return cost[i];
        if(dp[i] != -1) return dp[i];
        int ans = cost[i] + Math.min(solve(cost, dp, i-1), solve(cost, dp, i-2));
        dp[i] = ans;
        return ans;
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[cost.length];
        Arrays.fill(dp, -1);
        return Math.min(solve(cost, dp, n-1), solve(cost, dp, n-2));
    }
}
