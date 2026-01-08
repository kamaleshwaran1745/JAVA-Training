import java.util.Scanner;
public class com {
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          String s1 = "Enterprise software System";
          String s2 = "enterprise software system";
          String s3 = "Object oriented program";
          String s4 = "Backend development";System.out.println("Length of s1:"+s1.length());

          //CharAt
          System.out.println("Enter Index:");
          System.out.println("Char at:"+s1.charAt(sc.nextInt()));

          //toLowerCase
          System.out.println("in Small letters:"+s1.toLowerCase());

          //To upper case
          System.out.println("In Capital letters:"+s1.toUpperCase());


          //equals
          System.out.println("Equal or not:"+(100==100));
          System.out.println("Equal or not:"+(s1==s2));
          System.out.println("Equal or not:"+s1.equals(s2));
          System.out.println("Equal or not:"+s1.equalsIgnoreCase(s2));

          //substring
          System.out.println("Original string"+s1);
          System.out.println("Substring 1:"+s1.substring(5));
          System.out.println("Substring 2:"+s1.substring(0,5));
          System.out.println("Substring 3:"+s1.substring(5,10));
          System.out.println("Substring 4:"+s1.substring(5,s1.length()-5));

          }
}
