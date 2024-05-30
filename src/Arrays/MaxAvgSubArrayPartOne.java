/*
643. Maximum Average Subarray I
Level: Easy
You are given an integer array nums consisting of n elements, and an integer k.
Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

Example 1:

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
Example 2:

Input: nums = [5], k = 1
Output: 5.00000

Constraints:

n == nums.length
1 <= k <= n <= 105
-104 <= nums[i] <= 104
 */

package Arrays;

public class MaxAvgSubArrayPartOne {

    public static void main(String args[]) {
        int nums[] = {1, 12, -5, -6, 50, 3};
        System.out.println(findMaxAvg(nums, 4));
    }

    public static double findMaxAvg(int[] nums, int k) {
        double maximumSum = Double.NEGATIVE_INFINITY;
        double windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        if (windowSum > maximumSum) {
            maximumSum = windowSum;
        }
        for (int i = k; i < nums.length; i++) {
            windowSum = windowSum - nums[i - k] + nums[i];
            if (windowSum > maximumSum) {
                maximumSum = windowSum;
            }

        }

        return maximumSum / k;
    }


}
// Time Complexity of the above solution is O(N)