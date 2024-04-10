class Solution {
    public int strStr(String haystack, String needle) {
        char[] S = haystack.toCharArray();
        char[] W = needle.toCharArray();
        int[] T = kmp_table(W);

        int j = 0;// locatie string
        int k = 0;// locatie word
        while (j < S.length) {
            if (W[k] == S[j]) {
                j++;
                k++;
                if (k == W.length)
                    return j - k;
            } else {
                k = T[k];
                if (k < 0) {
                    j++;
                    k++;
                }
            }
        }
        return -1;
    }

    public int[] kmp_table(char[] W) {
        int[] T = new int[W.length];
        int pos = 1;
        int cnd = 0;

        T[0] = -1;

        while (pos < T.length) {
            if (W[pos] == W[cnd])
                T[pos] = T[cnd];
            else {
                T[pos] = cnd;
                while (cnd >= 0 && W[pos] != W[cnd])
                    cnd = T[cnd];

            }
            pos++;
            cnd++;
        }
        return T;
    }
}