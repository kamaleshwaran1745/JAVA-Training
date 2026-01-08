public class Transpos {
    public int[][] transpose(int[][] matrix) {
       int row = matrix.length;
       int col = matrix[0].length;
       int tran[][] = new int[col][row];
       for(int i=0;i<col;i++){
        for(int j=0;j<row;j++){
            tran[i][j]=matrix[j][i];
        }
       } 
       return tran;
    }
}