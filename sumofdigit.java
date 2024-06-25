public class sumofdigit {
    public static void main(String[] args) {
        int num = 12345;
        System.out.println(print(num));
    }
    private static int print(int n){
        if(n==1){
            return 1;
        }
return n%10+print(n/10);
    }
}
    