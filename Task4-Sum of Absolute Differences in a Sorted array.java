class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int totalSum = 0;

        // Find total sum
        for (int num : nums) {
            totalSum += num;
        }

        int prefixSum = 0;

        for (int i = 0; i < n; i++) {
            int x = nums[i];

            // Sum of differences with elements on the left
            int left = x * i - prefixSum;

            // Sum of differences with elements on the right
            int right = (totalSum - prefixSum - x)
                        - x * (n - i - 1);

            result[i] = left + right;

            // Add current element to prefix sum
            prefixSum += x;
        }

        return result;
    }
}