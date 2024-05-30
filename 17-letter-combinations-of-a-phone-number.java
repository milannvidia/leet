import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0)
            return res;
        char[][] map = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' }, { 'j', 'k', 'l' }, { 'm', 'n', 'o' },
                { 'p', 'q', 'r', 's' }, { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };
        char[] digit = map[digits.charAt(0) - '2'];
        for (char c : digit) {
            res.add(Character.toString(c));
        }
        for (int i = 1; i < digits.length(); i++) {
            List<String> curr = new ArrayList<>();
            digit = map[digits.charAt(i) - '2'];
            for (String str : res) {
                for (char c : digit) {
                    curr.add(str + c);
                }
            }
            res = curr;

        }
        return res;
    }
}