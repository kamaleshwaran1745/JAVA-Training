import java.util.Scanner;
class pattenshift{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int mid=(num+1)/2;
        for(int i=num;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i<=mid&&Math.abs(j-mid)==i-1||i==mid+1||(i>mid+1&&(j==1||j==num))){
                    System.out.print("* ");//single Space
                }
                else{
                    System.out.print("  ");//Double Spacesss
                }
            }
            System.out.print("\n");
        }
    }
}