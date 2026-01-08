class shifttest{
    public static void main(String[] args) {
        byte a=64;
        byte b;
        int i;
        System.out.println("Original valuve of A :"+a);
        i=a>>2;
        System.out.println("Left shift of A :"+i);
        b=(byte)(i>>2);
        System.out.println("Left shift of i :"+b);
        i=a<<2;
        System.out.println("Right shift of A :"+i);
    }
}