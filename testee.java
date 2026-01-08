import java.util.Scanner;
class testee{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println(" Enter No :");
       int no=sc.nextInt();
       System.out.println(" Enter Tabel :");
       int tab=sc.nextInt();
       for(int i=1;i<=no;i++){
        System.out.println(i+" X "+tab+" = "+i*tab);
       }
    }
}