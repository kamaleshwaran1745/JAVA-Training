import java.util.Scanner;

class digsum {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int primary = 0, secondary = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Diagonal sums
        for (int i = 0; i < n; i++) {
            primary += arr[i][i];
            secondary += arr[i][n - i - 1];
        }

        // Remove middle element if n is odd
        if (n % 2 == 1) {
            secondary -= arr[n / 2][n / 2];
        }

        System.out.println(primary);
        System.out.println(secondary);
        System.out.println(primary + secondary);

        sc.close();
    }
}
