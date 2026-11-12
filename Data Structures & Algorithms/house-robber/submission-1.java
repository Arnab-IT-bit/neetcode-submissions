class Solution {
    public int solve(int nums[], int i, int dp[]){
        if(i >= nums.length) return 0;
        if(dp[i] != -1) return dp[i]; // dp[i] represent that the rober can steal from that idx
        int take_i = nums[i] + solve(nums, i+2, dp);
        int skip_i = solve(nums, i+1, dp);

        return dp[i] = Math.max(take_i, skip_i);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];

        Arrays.fill(dp, -1);
        return solve(nums, 0, dp);
    }
}
