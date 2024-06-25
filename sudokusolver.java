

    public class sudokusolver {
	

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            int [][] grid ={
                    {5,3,0,0,7,0,0,0,0},
                    {6,0,0,1,9,5,0,0,0},
                    {0,9,8,0,0,0,0,6,0},
                    {8,0,0,0,6,0,0,0,3},
                    {4,0,0,8,0,3,0,0,1},
                    {7,0,0,0,2,0,0,0,6},
                    {0,6,0,0,0,0,2,8,0},
                    {0,0,0,4,1,9,0,0,5},
                    {0,0,0,0,8,0,0,7,9}
                    };
            Display(grid);
            System.out.println("-----------------");
        
        solver(grid,0,0);
    }
    
    
        private static void Display(int[][] grid) {
            // TODO Auto-generated method stub
            for(int i=0;i<grid.length;i++) {
                for(int j=0;j<grid.length;j++) {
                    System.out.print(grid[i][j]+" ");
                }
                System.out.println();
            }
                
            }
            
        
    
    
        private static void solver(int[][] grid, int row, int col) {
            // TODO Auto-generated method stub
            if(col==9) {
                col=0;
                row=row+1;
            }
            if(row == 9) {
                Display(grid);
                return;
            }
            if(grid[row][col]!=0) {
                solver(grid,row,col+1);
            }
            else {
                for(int i=1;i<10;i++) {
                    if(isvalid(grid,row,col,i)) {
                    grid[row][col]=i;
                    solver(grid,row,col+1);
                    grid[row][col]=0;
                }
            }
            
        }
    }
    
    
        private static boolean isvalid(int[][] grid, int row, int col, int val) {
    
            int r = row;
            int c = col;
    
            
    
            for (int i = 0; i < grid.length; i++) {
                if (grid[i][c] == val) {
                    return false;
                }
            }
    
            
            for (int i = 0; i < grid[0].length; i++) {
                if (grid[r][i] == val) {
                    return false;
                }
    
            }
    //		 for 3*3  metrix
            r=row-row%3;
            c=col-col%3;
            for(int i=r;i<r+3;i++) {
                for(int j=c;j<c+3;j++) {
                    if(grid[i][j]==val)
                        return false;
                }
            }
            
            
    
            return true;
        }
    
    }