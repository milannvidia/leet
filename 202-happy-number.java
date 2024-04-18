class Solution {
    public boolean isHappy(int n) {
        int s = n;
        int f = n;
        do {
            s = getNext(s);
            f = getNext(getNext(f));
        } while (s != f);
        return s == 1;
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