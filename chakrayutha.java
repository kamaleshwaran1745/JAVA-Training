import java.util.Scanner;
class chakrayutha{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size :");
        int no=sc.nextInt();
        int matrix[][] = new int[no][no];
        int num = 1;
        int pp=1;
        for(int r = 0;r<(no+1)/2;r++){
            for(int c =r;c<no-r;c++){     //Fill top rows
                matrix[r][c] = num++;
            }
            for(int c=r+1;c<no-r;c++){     // Fill right cols
                matrix[c][no-r-1] = num++;
            }
            for(int c=no-r-2;c>=r;c--){     // Fill Bottom rows
                matrix[no-r-1] [c]= num++;
            }
            for(int c=no-r-2;c>r;c--){     // Fill left col
                matrix[c] [r]= num++;
            }
            
        }
        //Display Matrix
        for(int r=0;r<no;r++){
            for(int c=0;c<no;c++){
                System.out.print(matrix[r][c]+"\t");
            }
            System.out.println("\n");
        }
        System.out.println("(0,0)");
        for(int r=0;r<no;r++){
            for(int c=0;c<no;c++){
                if(matrix[r][c]%11==0){
                    pp++;
                    System.out.println("("+r+","+c+")");
                }
            }
        }
        System.out.println("total power points :"+pp);
    }
}