
import java.util.Scanner;

class asciichk{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Character to see the ASCII value:");
        char no=sc.next().charAt(0);
        int num=(int)no;
        System.out.println("The Number is :"+num);

    }
}