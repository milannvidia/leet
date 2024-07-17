class Solution {
    public boolean isAnagram(String s, String t) {
        int[] charCount1 = new int[26];
        int[] charCount2 = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charCount1[s.charAt(i) - 97]++;
        }
        for (int i = 0; i < t.length(); i++) {
            charCount2[t.charAt(i) - 97]++;
        }

        for (int i = 0; i < 26; i++) {
            if (charCount1[i] != charCount2[i])
                return false;
        }
        return true;
    }
}