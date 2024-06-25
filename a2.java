import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            long x = scanner.nextLong();
            
            if (isPossible(x)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
    
    private static boolean isPossible(long x) {
           String str = String.valueOf(x);
        
           for (int i = 0; i < str.length(); i++) {
            int digit = Character.getNumericValue(str.charAt(i));
            if (digit < 5 || digit > 9) {
                return false;
            }
        }
        
           long half = x / 2;
        if (half % 10 >= 5) {
            return true;
        } else {
            return false;
        }
    }
}
