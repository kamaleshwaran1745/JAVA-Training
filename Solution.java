class Solution {
    public static void main(String args[]) {
        int num = 38;
        int dig;

        while (num >= 10) {
            int rev = 0;

            while (num > 0) {
                dig = num % 10;
                rev += dig;
                num = num / 10;
            }

            num = rev; // update num
            System.out.println("Number: " + num);
        }
    }
}
