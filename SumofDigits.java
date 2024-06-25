public class SumofDigits {
    public static void main(String[] args) {
        int sum=print(155);
        System.out.println(sum);
    }
private static int print(int n){
    if(n==0) {
        return 0;
    }
    return (n%10) + print(n/10);
}
}
