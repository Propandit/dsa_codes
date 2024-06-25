public class reverseno {
    public static void main(String []args) {
        int y=print(-556);
        System.out.println(y);

    }
    private static int print(int x){
        boolean isNegative =false;
        if(x<0){
            isNegative=true;
            x*= -1;
        }

        if(x<10){
            return x;}
        int rem = x % 10;
        int digit =x / 10;
                
                int rev= (int) (rem * Math.pow(10, String.valueOf(digit).length())) + print(digit);
                if(isNegative){
                    rev*=-1;
                }
                return rev;
                }

    }
