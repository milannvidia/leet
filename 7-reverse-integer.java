class Solution {
    public int reverse(int x) {
        long answer = 0;
        boolean negative = x < 0;
        if (negative)
            x *= -1;
        while (x > 0) {
            answer = answer * 10 + x % 10;
            x = x / 10;
        }
        if (answer > Integer.MAX_VALUE)
            return 0;
        if (answer < Integer.MIN_VALUE)
            return 0;
        if (negative)
            return (int) answer * -1;
        return (int) answer;
    }
}