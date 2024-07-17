import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        final int length = nums.length;
        int missing = length % 2 == 0 ? length + (length / 2 % 2) : (length + 1) / 2 % 2;

        for (int i : nums)
            missing ^= i;
        return missing;
        // Arrays.sort(nums);
        // for (int i = 0; i < nums.length; i++) {
        // if (i == nums[i])
        // continue;
        // return i;
        // }
        // return nums.length;
        // Arrays.sort(nums);
        // for (int i = 0; i < nums.length; i++) {
        // if (i == nums[i])
        // continue;
        // return i;
        // }
    }
}