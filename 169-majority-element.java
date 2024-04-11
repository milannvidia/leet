class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int curr = 0;
        for (int num : nums) {
            if (count == 0)
                curr = num;
            if (num == curr)
                count++;
            else
                count--;
        }
        return curr;
    }
}