class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == divisor)
            return 1;
        if (divisor == 1)
            return dividend;
        int sign = 1;
        if (dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0)
            sign = -1;
        long numer = Math.abs((long) dividend);
        long deler = Math.abs((long) divisor);
        long quotient = 0;
        for (int i = 30; i >= 0; i--) {
            if (numer >= (deler << i)) {
                quotient += (1 << i);
                numer -= (deler << i);
            }
        }
        return (int) (quotient * sign);
    }
}