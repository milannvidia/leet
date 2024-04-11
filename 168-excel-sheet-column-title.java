import java.util.HashMap;
import java.util.Map;

class Solution {
    public String convertToTitle(int columnNumber) {

        StringBuilder str = new StringBuilder();
        while (columnNumber > 0) {
            str.append((char) ((columnNumber - 1) % 26 + 65));
            columnNumber = (columnNumber - 1) / 26;
        }
        return str.reverse().toString();
    }
}