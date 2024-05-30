class Solution {
    public int threeSumClosest(int[] nums, int target) {

        int res = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int total = nums[i] + nums[j] + nums[k];
                if (Math.abs(target - total) < Math.abs(target - res)) {
                    res = total;
                }

                if (total < target)
                    j++;
                else
                    k--;
            }
        }
        return res;

    }
}