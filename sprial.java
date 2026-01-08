import java.util.*;
class sprial
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter Size :");
int no=sc.nextInt();
int matrix[][]=new int[no][no];
int num=1;
for(int r=0;r<no;r++)
{
for(int c=0;c<no;c++)
{
matrix[r][c]=num++;
}
}
for(int r=0;r<no;r++)
{
for(int c=0;c<no;c++){
System.out.print(matrix[r][c]+"\t");
}
System.out.print("\n\n");
}
for(int r=0;r<(no+1)/2;r++)
{
for(int c=r;c<no-r;c++){
System.out.print(matrix[r][c]+"\t");
}
for(int c=r+1;c<no-r;c++){
System.out.print(matrix[c][no-r-1]+"\t");
}
for(int c=no-r-2;c>=r;c--){
System.out.print(matrix[no-r-1][c]+"\t");
}
for(int c=no-r-2;c>r;c--){
System.out.print(matrix[c][r]+"\t");
}

}

}
}