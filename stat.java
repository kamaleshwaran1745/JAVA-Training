public class stat {
    static int i = 100;
    static void meth(){
        System.out.println("i is:"+i);
    }
    static{
        System.out.println("From static block");
    }
    public static void main(String[] args) {
        meth();
        System.out.println("Hello");
    }
}