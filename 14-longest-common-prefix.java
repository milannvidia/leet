class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minSize = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < minSize)
                minSize = strs[i].length();
        }
        int maxIndex = -1;
        loop: for (int i = 0; i < minSize; i++) {
            for (int j = 0; j < strs.length - 1; j++) {
                if (strs[j].charAt(i) != strs[j + 1].charAt(i))
                    break loop;
            }
            maxIndex = i;
        }
        return strs[0].substring(0, maxIndex + 1);
    }
}