class Solution {
    public int maxArea(int[] height) {
        int ind0 = 0;
        int ind1 = height.length - 1;
        int max = 0;
        while (ind0 < ind1) {
            int curr = Math.min(height[ind0], height[ind1]) * (ind1 - ind0);
            max = Math.max(max, curr);
            if (height[ind0] < height[ind1]) {
                ind0++;
            } else {
                ind1--;
            }
        }
        return max;
    }
}