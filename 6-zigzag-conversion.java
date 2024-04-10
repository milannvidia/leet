import java.util.ArrayList;

class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        ArrayList<Character>[] answer = new ArrayList[numRows];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = new ArrayList<>();
        }
        int index = 0;
        int repeat = numRows * 2 - 2;
        for (int i = 0; i < s.length(); i++) {
            index = i % repeat;
            if (index >= numRows) {
                index = repeat - index;
            }
            answer[index].add(s.charAt(i));
        }
        StringBuilder finalan = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (Character ch : answer[i]) {
                finalan.append(ch);
            }
        }
        return finalan.toString();
    }
}