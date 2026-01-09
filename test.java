import java.util.*;
class LLNode
{
    int rno;
    String name;
    LLNode next;

    public LLNode(int rno,String name){
        this.rno=rno;
        this.name=name;
        this.next=null;
    }
}
 class Test{
    LLNode head;
      LLNode insertBegin(int rollno,String  name,LLNode head){
            LLNode tmp=new LLNode(rollno,name);
            tmp.next=head;
            return tmp;
      }
      public static void main(String args[]){
        Test t=new Test();
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("\t\t---------Menu---------");
            System.out.println("\t\t Insert in the beginning");
             System.out.println("\t\t Enter option :");
             String n=sc.next();
             switch(n){
             case "1":
                System.out.println("Enter rollno and name :");
                t.head=t.insertBegin(sc.nextInt(),sc.next(),t.head);
                System.out.println("record inserted in the beginning");
                break;
        }

            System.out.println("Do you want to continue (Y/N)? :");
      }
        while(sc.next().equalsIgnoreCase("t"));

  }
    }
  