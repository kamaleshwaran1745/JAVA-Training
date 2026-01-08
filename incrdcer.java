class incrdcer{
    public static void main(String[] args) {
        int a=5;
        int b;
        System.out.println("A:"+a);
        b=a++;
        System.out.println("A:"+a);
        System.out.println("B:"+b);
        b=++a;
        System.out.println("A:"+a);
        System.out.println("B:"+b);
        b=a--;
        System.out.println("A:"+a);
        System.out.println("B:"+b);
        b=--a;
        System.out.println("A:"+a);
        System.out.println("B:"+b);
        int c=4;
        int f;
        f=++c + ++c + ++c;
        System.out.println("C:"+c);
        System.out.println("F:"+f);
        int t=2;
        // int r=4;
        int g=t++ + ++t + t++;
        System.out.println("T:"+t);
        System.out.println("G:"+g);
        // System.out.println("R:"+r);


    }
}