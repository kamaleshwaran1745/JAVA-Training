import java.util.Scanner;
class prymid{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
             for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
        
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.print("\n");
    }
       for(int i=1;i>0;i--){
             for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
        
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.print("\n");
    }
}
}