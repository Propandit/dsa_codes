import java.util.*;
public class pattern6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for (int row = 1; row <=2*n-1; row++){  
            int totalColsInRow = row>n ? 2*n-row: row;                
            int space=n-totalColsInRow; 
            for (int i=1; i<=space; i++){
                System.out.print(" ");
            }
            for (int col = 1; col<= totalColsInRow ; col++)
            {
        System.out.print("* ");
    }
System.out.println();
    }
}
}
