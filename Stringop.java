
import java.util.Scanner;

class Stringop{
    public static void main(String[] args) {
    Scanner sc   = new Scanner(System.in);
    String s1 = " Enterprise Software System ";
    String s2= " enterprise software system ";
    String s3= " Object Oriented Program ";
    String s4 = " Backend development ";
    //length()
    System.out.println("Length of s1 :"+s1.length());
    //CharAt()
    System.out.println("Enter the index :");
    System.out.println("CharAt : "+s1.charAt(sc.nextInt()));
    //lower case
    System.out.println(" In Smaller Letter :"+s1.toLowerCase());
    //Uper case
    System.out.println("capital Letters : "+s1.toUpperCase());
    //Equals
    System.out.println("Equal or Not :"+(s1==s1));
    System.out.println("Equal or Not :"+(100==100));
    System.out.println("Equal or Not :"+s1.equals(s2));
    System.out.println("Equal or Not :"+s1.equalsIgnoreCase(s2));
    //Substring
        System.out.println("Orginal String :"+s1);
    System.out.println("Substring 1 :"+s1.substring(5));
    System.out.println("Substring 2 :"+s1.substring(0,5));
    System.out.println("Substring 3 :"+s1.substring(5,10));
    System.out.println("Substring 4 :"+s1.substring(5,s1.length()-5));
    // Container
    System.out.println("Orginal String :"+s1);
    System.out.println("Starts with :"+s1.contains("Software"));
    System.out.println("Starts with :"+s1.contains("software"));
    // starts with & ends with
    System.out.println(" Orginal String :"+s4);
    System.out.println("starts with :"+s4.startsWith("Ba"));
    System.out.println(" Ends with :"+s4.endsWith("nt"));
    System.out.println(" Ends with :"+s4.endsWith("NT"));
    //indexOf
    System.out.println("Index of :"+s4.indexOf('n'));
    //lastIndex
    System.out.println(" Index of :"+s4.lastIndexOf('N'));
    //replace
    System.out.println("Orginal String :");
    System.out.println(" replace :"+s1.replace("Software","Application"));
    //Trim
    System.out.println(" Orginal String :"+s3);
    System.out.println("After Trim :"+s3.trim());
    //Concat
     System.out.println(" Orginal String :"+s1);
     System.out.println(" Concat :"+s1.concat(" ").concat(s4));
     System.out.println("Concat :"+s1+s4);
    //split
        System.out.println(" Orginal String :"+s1);
        String[] w=s1.split(" ");
        System.out.println(" After Split :");
        for(String w1:w){
            System.out.println(w1);
        }
    // toCharArray()
        System.out.println(" Orginal String :"+s1);
        char[] chararr=s1.toCharArray();
        for(char c:chararr){
            System.out.println(c+"-");
        }
    //Format()
    int version = 24;
    String s = "Java Platform";
    String sf = String.format("tech %s,Version %d",s,24);
    System.out.println("\n"+sf);

    }
}