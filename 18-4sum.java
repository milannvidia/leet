import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                int start = j + 1;
                int end = nums.length - 1;
                while (start < end) {
                    long total = nums[i];
                    total += nums[j];
                    total += nums[start];
                    total += nums[end];
                    if (total > target)
                        end--;
                    else if (target > total)
                        start++;
                    else {
                        res.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
                        int low = nums[start];
                        int high = nums[end];
                        start++;
                        end--;
                        while (start < end && nums[start] == low)
                            start++;
                        while (start < end && nums[end] == high)
                            end--;
                    }

                }
            }
        }

        return res;
    }
}