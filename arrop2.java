import java.util.Scanner;
class stu{
    int rno;
    String name;
    void input(int rno,String name){
        this.rno=rno;
        this.name=name;
    }
    void display(){
        System.out.println(" Roll-No :"+rno+" and Name :"+name);
    }
}
@SuppressWarnings("unused")
class arrop2{
    public static void main(String[] args) {
        stu s[]=new stu[3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.println("Enter no and name :");
            s[i]=new stu();
            s[i].input(sc.nextInt(),sc.next());
        }
        for(int i=0;i<3;i++){
            s[i].display();
        }
    }
}