import java.util.*;

class Main1 {
    public static void main(String args[]) {
        Main1 obj = new Main1();
        List<List<Integer>> lst = obj.meth(15);
        for (List<Integer> row : lst) {
            System.out.println(row);
        }
    }

    public List<List<Integer>> meth(int no) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= no; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                row.add(j);
            }
            result.add(row);
        }
        return result;
    }
}
