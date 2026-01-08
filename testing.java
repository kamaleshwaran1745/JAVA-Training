import java.util.Scanner;

class testing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 9999 || num < 0) {
            System.out.println("Out of range");
        } else if (num >= 1000) {
            System.out.println("FOUR digit");
        } else if (num >= 100) {
            System.out.println("Triple digit");
        } else if (num >= 10) {
            System.out.println("Double digit");
        } else {
            System.out.println("Single digit");
        }
    }
}