class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] charForChar = new int[128];
        boolean[] checkDUP = new boolean[128];
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if (charS == 0)
                return false;
            if (charForChar[charS] == 0) {
                if (checkDUP[charT])
                    return false;
                charForChar[charS] = charT;
                checkDUP[charT] = true;
            } else {
                if (charForChar[charS] != charT)
                    return false;

            }
        }

        return true;
    }
}