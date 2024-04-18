class Solution {
    public boolean isHappy(int n) {
        int s = n;
        int f = n;
        while (f != 1 && s != f) {
            s = getNext(s);
            f = getNext(f);
        }
    }

    public int getNext(int n) {
        int newNum = 0;
        while (n != 0) {
            int num = n % 10;
            newNum += num * num;
            n /= 10;
        }
        return newNum;
    }
}