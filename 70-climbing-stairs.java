class Solution {
    public int climbStairs(int n) {
        if (n == 1 || n == 0)
            return n;
        int[] sol = new int[n];
        sol[0] = 1;
        sol[1] = 2;
        for (int i = 2; i < n; i++) {
            // solution of -2 plus 2 steps
            // + soltuion of -1 steps plus 1 step
            sol[i] = sol[i - 1] + sol[i - 2];
        }
        return sol[n - 1];
    }
}