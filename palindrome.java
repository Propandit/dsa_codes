public class palindrome {
    public static void main(String []args) {
        System.out.println(palin(1321));

    }
    private static int print(int x){
        

        if(x<10){
            return x;}
        int rem = x % 10;
        int digit =x / 10;
                
                int rev= (int) (rem * Math.pow(10, String.valueOf(digit).length())) + print(digit);
                return rev;
            
                }
                static boolean palin(int x){
                    return x == print(x);
                }
                }

    


