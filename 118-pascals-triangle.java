import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows == 0)
            return triangle;

        List<Integer> first = new ArrayList<>();
        first.add(1);
        triangle.add(first);

        if (numRows == 1)
            return triangle;
        for (int i = 1; i < numRows; i++) {
            List<Integer> curr = new ArrayList<>();
            List<Integer> prev = triangle.get(i - 1);
            curr.add(1);
            for (int j = 1; j < i; j++) {
                curr.add(prev.get(j - 1) + prev.get(j));
            }
            curr.add(1);
            triangle.add(curr);
        }
        return triangle;

    }
}