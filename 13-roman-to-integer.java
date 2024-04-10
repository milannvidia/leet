import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> nums = new HashMap<Character, Integer>();
        nums.put('I', 1);
        nums.put('V', 5);
        nums.put('X', 10);
        nums.put('L', 50);
        nums.put('C', 100);
        nums.put('D', 500);
        nums.put('M', 1000);
        int max = 1;
        int total = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int value = nums.get(s.charAt(i));
            if (value < max) {
                total -= value;
            } else {
                total += value;
                max = value;
            }
        }
        return total;
    }
}