class Solution {
    public int solve_0(int nums[], int i, int dp[]){
        if(i >= nums.length-1) return 0;

        if(dp[i] != -1) return dp[i];
        int take_i = nums[i] + solve_0(nums, i+2, dp);
        int skip_i = solve_0(nums, i+1, dp);

        return dp[i] = Math.max(take_i, skip_i);
    }
    public int solve_1(int nums[], int i, int dp[]){
        if(i >= nums.length) return 0;

        if(dp[i] != -1) return dp[i];
        int take_i = nums[i] + solve_1(nums, i+2, dp);
        int skip_i = solve_1(nums, i+1, dp);

        return dp[i] = Math.max(take_i, skip_i);
     }
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int dp1[] = new int[nums.length];
        int dp2[] = new int[nums.length];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        return Math.max(solve_0(nums, 0, dp1), solve_1(nums, 1, dp2));
    }
}
