import java.util.Scanner;
class LLNode
{
 int rno;
String name;
LLNode next;

public LLNode(int rno,String name)
{
this.rno=rno;
this.name=name;
this.next=null;
}
} 
public class Test
{
LLNode head;
LLNode insertBegin(int rollno,String name,LLNode head)
{
LLNode tmp=new LLNode(rollno,name);
tmp.next=head;
return tmp;
}

public static void main(String args[])
{
Test l=new Test();
Scanner sc=new Scanner(System.in);
String c;
do
{
System.out.println("\t\t---------- Menu -------------- ");
System.out.println("\t\t1. Insert in the beginning");
System.out.print("Enter Option : ");
String n="1";

switch(n)
{
case "1":
System.out.print("Enter RollNo  and name : ");
l.head=l.insertBegin(101,"Dinesh",l.head);
System.out.println("Record inserted in the beginning");
break;
}
System.out.print("Do you want to continue (Y/N) ? :");
c="Y";
} while(c.equalsIgnoreCase("Y"));
}
}