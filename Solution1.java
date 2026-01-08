import java.util.*;

class Solution1 {
    public static List<List<Integer>> main(String[] args) {
        
     {
         Scanner sc=new Scanner(System.in);
        int numRows=sc.nextInt();
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1); 

            for (int j = 1; j < i; j++) {
                int val = triangle.get(i - 1).get(j - 1)
                        + triangle.get(i - 1).get(j);
                row.add(val);
            }

            if (i > 0) {
                row.add(1); 
            }

            triangle.add(row);
        }

        return triangle;
    }
}
}
