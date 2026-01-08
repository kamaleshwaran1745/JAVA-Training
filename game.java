import java.util.Random;
import java.util.Scanner;
class game{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter Your Name : ");
        sc.nextLine();
        int a=1;
        for(int i=1;i<=3;i++){
        System.out.println("Enter the Random number From 1-10 :");
        int unum = sc.nextInt();
        int randNum=rand.nextInt(1,10);
        if(unum==randNum){

            System.out.println("You win "+randNum);
        }
        System.out.println("The Random Number is :"+randNum);
        
    }
    if(a!=1){
    System.out.println("Better Luck Next Time");
}
}
}