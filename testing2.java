import java.util.Scanner;
class testing2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        int num;
        num=(int)ch;
        if(num>=65&&num<=90){
            System.out.println(" capital");
        }
        else if(num>=97&&num<=126){
            System.out.println("Small");
        }
        else if(num>=48&&num<=57){
            System.out.println(" Number");
        }
        else if(num>=33&&num<=47)
            {
            System.out.println(" Symbol ");
        }
         else if(num>=58&&num<=64)
            {
            System.out.println(" Symbol ");
        }
         else if(num>=91&&num<=96)
            {
            System.out.println(" Symbol ");
        }
         else if(num>=123&&num<=126)
            {
            System.out.println(" Symbol ");
        }
        else{
            System.out.println(" Non PrintAble");
        }
    }
}