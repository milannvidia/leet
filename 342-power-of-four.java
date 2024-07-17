class Solution {
    public boolean isPowerOfFour(int n) {
        if (n == 0)
            return false;
        int mask = 0b01010101010101010101010101010101;
        return (mask | n) == mask && ((n - 1) & n) == 0;

    }
}