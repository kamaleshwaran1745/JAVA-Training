import java.util.Scanner;
class patten3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();

        for(int i=no;i>=1;i--){
            int count=64+no;
            for(int j=no;j>=i;j--){
                System.out.print((char)count+" ");
                 count--;
            }
            System.out.print("\n");
            count++;
        }
         
    }
}