import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        String longest = "";
        String current = "";
        Set<Character> chars = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            Character curr = s.charAt(i);
            if (chars.contains(curr)) {
                if (current.length() > longest.length()) {
                    longest = current;
                }
                current = "";
                chars.clear();
            }
            current.concat(Character.toString(curr));
            chars.add(curr);
        }
        return longest.length();
    }
}