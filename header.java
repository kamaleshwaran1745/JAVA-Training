import java.util.Scanner;

class LLNode {
    int rno;
    String name;
    LLNode next;

    public LLNode(int rno, String name) {
        this.rno = rno;
        this.name = name;
        this.next = null;
    }
}

class {
    LLNode head;

    // Insert at Beginning
    LLNode insertBegin(int rno, String name, LLNode head) {
        LLNode temp = new LLNode(rno, name);
        temp.next = head;
        return temp;
    }

    // Insert at End
    LLNode insertEnd(int rno, String name, LLNode head) {
        LLNode temp = new LLNode(rno, name);

        if (head == null) {
            return temp;
        }

        LLNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }

    // Display
    void display(LLNode head) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        LLNode curr = head;
        while (curr != null) {
            System.out.println(curr.rno + " " + curr.name);
            curr = curr.next;
        }
    }
}

class linkedlst {
    public static void main(String[] args) {

        Test t = new Test();
        Scanner sc = new Scanner(System.in);
        char ch;

        do {
            System.out.println("---------------MENU--------------");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Display");
            System.out.println("Enter your Option :");

            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Enter RollNo and Name :");
                    t.head = t.insertBegin(sc.nextInt(), sc.next(), t.head);
                    break;

                case 2:
                    System.out.println("Enter RollNo and Name :");
                    t.head = t.insertEnd(sc.nextInt(), sc.next(), t.head);
                    break;

                case 3:
                    t.display(t.head);
                    break;

                default:
                    System.out.println("Invalid Option");
            }

            System.out.println("Do you Want To Continue(Y/N)? :");
            ch = sc.next().charAt(0);

        } while (ch == 'Y' || ch == 'y');

        sc.close();
    }
}
