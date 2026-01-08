class P1
{
public static void main(String args[])
{  
 int a=10,b=5,c=3,d=3;
 if((a>b)&&(c==++d))
 {
       System.out.println(a++ +" ,"+ --b+" ,"+ ++c+" ,"+d--);
       System.out.println(" A :"+a);
       System.out.println(" B :"+b);
       System.out.println(" C :"+c);
       System.out.println(" D :"+d);
       
       
 }
 else{
       System.out.println(a++ +", "+b+" ,"+ ++c+" ,"+d);
       System.out.println(" A :"+a);
       System.out.println(" B :"+b);
       System.out.println(" C :"+c);
       System.out.println(" D :"+d);
 }
 int i=0;
switch(i){
       case 0:i++;
        case 1:i++;
         case 2:++i;
         System.out.println(i++);
         System.out.println(i);
}
}


}
 