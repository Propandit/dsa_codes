public class climbtest {
    
    public static void main(String[] args) {
        int n=2;
        System.out.println(stair(n));
    
    }
        private static int stair(int n) {
        
    
        
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        
    return stair(n - 1)+stair(n - 2);
        }
    }    