import java.util.Random;
class random{
    public static void main(String args[]){
        Random rand = new Random();
        for(int i=1;i<=5;i++){
            System.out.println(rand.nextInt(1,50));
        }
        System.out.println("Your Four Digit OTP :"+rand.nextInt(1000,10000));
    }
}