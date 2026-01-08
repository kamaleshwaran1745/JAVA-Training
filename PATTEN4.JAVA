import java.util.Scanner;
class PATTEN4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=num;i>1;i--){
            for(int s=1;s<=2*(num-i);s++){
                System.out.print(s+" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            
            for(int j=i;j<num;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
