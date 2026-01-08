class arrop1{
    public static void main(String[] args) {
       int O1[]={1,2,3,4,5};
       int O2[]={1,2,3};
       int O3[]={1,2,3,4,5,6,7};
       int T[][]={O1,O2,O3};
       for(int s[]:T)
       {
           for(int e:s)
           {
               System.out.print(e + " ");
           }
           System.out.println();
       }
    }
}