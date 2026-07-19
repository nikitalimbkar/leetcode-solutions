class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        ans[0] = 1;

        // prefix directly in ans
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int suffix = 1;

        // multiply suffix on the fly
        for (int i = n - 2; i >= 0; i--) {
            suffix *= nums[i+1];
            ans[i] *= suffix;
        }

        return ans;
    }
}