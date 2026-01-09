class LLNode{

}
public class p2 {
    public static void main(String args[]){
        LLNode L1=new LLNode();
        if (L1==null){
            System.out.println("Node is empty");
        }
        else{
            System.out.println("Node is not empty");
        }
        L1=new LLNode();
        System.out.println("Reference / address:"+L1);



        return tmp;
    }
}
LLNode temp = head;
while(temp.next!=null)
    temp=temp.next;

temp.next=tmp;
return head;