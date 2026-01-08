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

          //contains
          System.out.println("Original string"+s1);
          System.out.println("Contains:"+s1.contains("Software"));
          System.out.println("Contains:"+s1.contains("Software"));

          //Starts with
          System.out.println("Original string:"+s4);
          System.out.println("Starts with:"+s3.startsWith("Ba"));
          System.out.println("ENds with:"+s3.endsWith("nt"));
          System.out.println("Ends with:"+s4.endsWith("NT"));

          //indexOf
          System.out.println("Index of:"+s4.indexOf('n'));

          //Lastindex of
          System.out.println("Index of:"+s4.lastIndexOf('n'));

          //replace
          System.out.println("Original string:"+s1);
          System.out.println("Replace:"+s1.replace("Software","Application"));

          //trim
          System.out.println("Original string:"+s3);
          System.out.println("After him:"+s3.trim());

          //concat
          System.out.println("Origianl string:"+s1);
          System.out.println("Concate"+s1.concat("".concat(s4)));
          System.out.println("Concate"+ s1+s4);

          //split
          String[] w=s1.split(" ");
          System.out.println("After split:");
          for(String w1:w) 
            System.out.println(w1);
        
          //toCharArray()-split as char
          System.out.println("Original string:"+s1);
          char[] chararr=s1.toCharArray();
          for(char c:chararr){
            System.out.println(c+"-");
          }              

          //format()
          int version=24;
          String s = "Java Platform";
          String sf = String.format("Tech: %s,Version %d",s,24);
          System.out.println("\n"+sf);
          


          }
}
