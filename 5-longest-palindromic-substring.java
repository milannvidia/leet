class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int maxlength = 1;
        boolean[][] check = new boolean[s.length()][s.length()];
        for (int i = 0; i < check.length; i++) {
            check[i][i] = true;
        }
        for (int i = 0; i < check.length - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                check[i][i + 1] = true;
                maxlength = 2;
                start = i;
            }
        }
        for (int k = 3; k <= s.length(); k++) {
            for (int i = 0; i < s.length() - k + 1; i++) {

                int j = i + k - 1;

                if (check[i + 1][j - 1]
                        && s.charAt(i) == s.charAt(j)) {
                    check[i][j] = true;

                    if (k > maxlength) {
                        start = i;
                        maxlength = k;
                    }
                }
            }
        }

        return s.substring(start, start + maxlength);
    }
}