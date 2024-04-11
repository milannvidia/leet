import java.util.*;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) {
            List<Integer> x = new ArrayList<>(1);
            x.add(1);
            return x;
        }
        if (rowIndex == 1) {
            List<Integer> x = new ArrayList<>(1);
            x.add(1);
            x.add(1);
            return x;
        }

        int numberElements = ((rowIndex + 2) * (rowIndex + 1)) / 2;
        List<Integer> triangle = new ArrayList<>(numberElements);
        for (int i = 0; i < numberElements; i++) {
            triangle.add(1);
        }
        for (int i = 2; i <= rowIndex; i++) {
            int startRow = ((i + 1) * i) / 2;
            int startPrev = (i * (i - 1)) / 2;
            for (int j = 1; j < i; j++) {
                int value = triangle.get(startPrev + j - 1) + triangle.get(startPrev + j);
                triangle.set(startRow + j, value);
            }
        }
        int index = ((rowIndex + 1) * rowIndex) / 2;
        triangle = triangle.subList(index, triangle.size());
        return triangle;
    }
}