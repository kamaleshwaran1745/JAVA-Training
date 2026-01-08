import java.util.*;

class eqrocl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] grid = new int[n][n];

        // Input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int count = 0;

        // Compare each row with each column
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                boolean equal = true;

                for (int k = 0; k < n; k++) {
                    if (grid[r][k] != grid[k][c]) {
                        equal = false;
                        break;
                    }
                }

                if (equal) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
