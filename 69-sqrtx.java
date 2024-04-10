class Solution {
    public int mySqrt(int x) {
        long b = x;
        while (b * b > x) {
            b = (b + x / b) / 2;
        }
        return (int) b;
    }
}