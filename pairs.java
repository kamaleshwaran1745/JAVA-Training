public class pairs {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int count =0;         //roe column pairs - 2352
        for(int r=0;r<n;r++){
            for(int c = 0;c<n;c++){
                boolean isequal = true;
                for(int k=0;k<n;k++){
                    if(grid[r][k]!=grid[k][c]){
                        isequal =false;
                        break;
                    }
                }
                if(isequal){
                    count++;
                }
            }
        }
        return count;
    }
}