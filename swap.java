class swap{
    public static void main(String[] args) {
        // int a=1;
        // int b=2;
        // int c=3;
        // a=a+b+c;
        // b=a-b-c;
        // c=a-b-c;
        // a=a-b-c;
         int a=1;
        int b=2;
        int c=3;
        a=a+b+c;
        b=a-(b+c);
        c=a-(b+c);
        a=a-(b+c);
        System.out.println("A :"+a);
         System.out.println("B :"+b);
          System.out.println("C :"+c);

    }
}