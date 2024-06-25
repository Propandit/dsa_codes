import java.util.*;
public class pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int row = 1; row <=2*n-1; row++){  
            int totalColsInRow = row>n ? 2*n-row: row;                
            
            for (int col = 1; col<= totalColsInRow ; col++)
            {
        System.out.print("*");
    }
System.out.println();
    }
}
}
