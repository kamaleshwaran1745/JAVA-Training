import java.util.*;

class Solution2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        int c = 1;

        for (int j = 0; j <= rowIndex; j++) {
            if (j == 0) {
                c = 1;
            } else {
                c = c * (rowIndex - j + 1) / j;
            }
            row.add(c);
        }

        return row;
    }
}
