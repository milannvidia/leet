import java.util.ArrayList;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1)
            return false;
        Stack<Character> stapel = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character curr = s.charAt(i);
            switch (curr) {
                case '(' -> stapel.add(curr);
                case '{' -> stapel.add(curr);
                case '[' -> stapel.add(curr);

                case ')' -> {
                    if (stapel.isEmpty())
                        return false;
                    if (stapel.peek() != '(')
                        return false;
                    stapel.pop();
                }
                case '}' -> {
                    if (stapel.isEmpty())
                        return false;
                    if (stapel.peek() != '{')
                        return false;
                    stapel.pop();
                }
                case ']' -> {
                    if (stapel.isEmpty())
                        return false;
                    if (stapel.peek() != '[')
                        return false;
                    stapel.pop();
                }
            }
        }
        return stapel.isEmpty();
    }
}