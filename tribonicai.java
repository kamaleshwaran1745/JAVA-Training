import java.util.Scanner;
class tribonicai{
    public static int main(String args[]){
        int t=0;
        int t1=1;
        int t2=1;
        int t4;
        int temp = 0;
        Scanner sc=new Scanner(System.in);
        t4=sc.nextInt();
        if(t4==1||t4==2)
            return 1;
        if(t4==0)
            return 0;
        for(int i=3;i<=t4;i++){
           temp=t+t1+t2;
           t=t1;
           t1=t2;
           t2=temp;
        }
        return temp;
    }
}