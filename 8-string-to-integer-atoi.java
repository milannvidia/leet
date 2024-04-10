import java.util.Iterator;
import java.util.LinkedList;

class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty())
            return 0;
        boolean neg = s.charAt(0) == '-';
        boolean pos = s.charAt(0) == '+';
        if (neg || pos) {
            s = s.substring(1);
        }
        int x = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                int curr = s.charAt(i) - '0';

                if (x > Integer.MAX_VALUE / 10 || (x == Integer.MAX_VALUE / 10 && curr > Integer.MAX_VALUE % 10)) {
                    return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                x = x * 10 + curr;

            } else {
                break;
            }
        }
        return neg ? -x : x;
    }
}