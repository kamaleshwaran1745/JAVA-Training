
import java.util.Scanner;

class typecaste{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius :");
        int r=sc.nextInt();
        float pi=3.14F;
        float area=pi*r*r;
        System.out.println("Area is :"+area);
    }
}