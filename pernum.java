import java.util.Scanner;
class pernum{
    public static boolean  main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr no");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        return sum==num;
    }
}