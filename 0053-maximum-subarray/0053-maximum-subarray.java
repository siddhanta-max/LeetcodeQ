class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;

        if (n==0) {
            return 0;
        }

        int currentSum = nums[0];
        int maxSum = nums[0];

        for(int index = 1; index < n; index++) {

            currentSum = Math.max(nums[index], currentSum + nums[index]);

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;

    }
}