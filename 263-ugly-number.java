class Solution {
    public boolean isUgly(int n) {
        if (n < 1)
            return false;
        if (n == 1)
            return true;
        return rec(n, 2) || rec(n, 3) || rec(n, 5);
    }

    public boolean rec(int a, int deler) {
        if (a == 2 || a == 3 || a == 5)
            return true;
        if (a % deler != 0)
            return false;
        int temp = a / deler;
        return rec(temp, 2) || rec(temp, 3) || rec(temp, 5);
    }
}