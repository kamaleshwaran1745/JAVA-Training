import java.util.Scanner;

class LLNode {
    int rno;
    String name;
    LLNode next;

    public LLNode(int rno, String name) {
        this.rno = rno;
        this.name = name;
        this.next = null;   // fixed: 'full' → 'null'
    }
}

class Test {
    LLNode head;

    LLNode insertBegin(int rollno, String name, LLNode head) {
        LLNode tmp = new LLNode(rollno, name);
        tmp.next = head;
        return tmp;
    }

    public static void main(String[] args) {
        Test I = new Test();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\t\t---------------Menu-------------");
            System.out.println("\t\t 1.Insert at beginning");
            System.out.println("Enter option");
            int n = sc.nextInt();   // fixed: should be int, not String

            switch (n) {
                case 1:
                    System.out.println("Enter roll number and name:");
                    I.head = I.insertBegin(sc.nextInt(), sc.next(), I.head);
                    System.out.println("Record inserted in the beginning:");
                    break;
            }

            System.out.print("Do you want to continue(Y/N?)");
        } while (sc.next().equalsIgnoreCase("Y"));  // fixed: while loop placement
    }
}