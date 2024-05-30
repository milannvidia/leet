import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        recursion(res, 0, 0, n, "");
        return res;

    }

    public void recursion(List<String> res, int left, int right, int n, String s) {
        if (s.length() == n * 2) {
            res.add(s);
            return;
        }

        if (left < n) {
            recursion(res, left + 1, right, n, s + "(");
        }
        if (right < left) {
            recursion(res, left, right + 1, n, s + ")");
        }
    }
}