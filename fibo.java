import java.util.Scanner;

public class fibo {
    static int series(int n){
        if(n==1||n==2){
            return n;
        }
        return series(n-1) + series(n-2);
        }
         static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();

            
        for (int i=0; i<n ; i++){
            System.out.print(series(i));
        }
}
}