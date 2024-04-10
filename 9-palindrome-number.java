class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int temp = x;
        int answer = 0;
        while (temp > 0) {
            answer = answer * 10 + temp % 10;
            temp = temp / 10;
        }
        return x == answer;

    }
}