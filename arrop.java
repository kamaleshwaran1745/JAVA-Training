import java.util.Scanner;

class arrop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[5][];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the column-Row " + i + ": ");
            int col = sc.nextInt();
            arr[i] = new int[col];
        }

        int n = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = n++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
