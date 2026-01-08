import java.util.Scanner;

public class h {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(); 

        for(int i = 1; i <= 5; i++){
            System.out.println("Enter content" + i + ":");
            s.append(sc.next()).append(" ");
        }
        System.out.println(s);
    }
}