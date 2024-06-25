
import java.util.Arrays;

public class n_queen {
    public static void main(String[] args) {
        char bard[][]=new char[4][4];
        int tq=4;
        for (int i = 0; i < bard.length; i++) {
            for (int j = 0; j < bard.length; j++) {
                bard[i][j]='x';

            }

        }
        queenbard(bard,tq,0);

    }

    private static void queenbard(char[][] bard,int tq, int row) {
        if(row== bard.length){
            System.out.println("-----hello queen ------");
            for (int i = 0; i < bard.length ; i++) {
                for (int j = 0; j < bard.length; j++) {
                    System.out.print(bard[i][j]);
 
                }
                System.out.println();

            }
            return;
        }
        for (int col = 0; col < bard.length ; col++) {
            if(issafe(bard,row,col)){
                bard[row][col]='q';
                queenbard(bard,tq-1,row+1);
                bard[row][col]='x';
            }

        }
    }

    private static boolean issafe(char[][] bard, int row, int col) {
        // vertical
        for (int i = row-1; i >=0 ; i--) {
            if (bard[i][col]=='q')
                return false;
            
        }
        //diagonal
        for (int i = row-1,j=col-1; i >=0&&j>=0 ; i--,j--) {
            if (bard[i][j]=='q')
                return false;

        }

        for (int i = row-1,j=col+1; i >=0 &&j< bard.length; i--,j++) {
            if (bard[i][j]=='q')
                return false;

        }
        return true;
    }
}