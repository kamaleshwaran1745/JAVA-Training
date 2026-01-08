class bittest{
    public static void main(String[] args) {
    int num=7;
    if((num&1)==0)
    {
       System.out.println("EVEN"); 
    }
    else{
        System.out.println("ODD"); 
    }
    int a=5;
    int b=10;
     System.out.println("Before swap A is :"+a);
      System.out.println("Before swap B is :"+b);
    a=a^b;
     b=a^b;
      a=a^b;
      System.out.println("After swap A is :"+a);
      System.out.println("After swap B is :"+b);
}
}