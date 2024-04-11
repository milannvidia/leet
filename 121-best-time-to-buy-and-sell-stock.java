class Solution {
    public int maxProfit(int[] prices) {
        int low = prices[0];
        int delta = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < low) {
                low = prices[i];
            } else if (prices[i] - low > delta) {
                delta = prices[i] - low;
            }
        }
        return delta;
    }
}