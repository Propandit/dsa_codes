class POWER {
    public static void main(String[] args) {
        int a=4;
        int n=2;
        System.out.println(print(a,n));
    }
    private static int print(int a,int n){
        if(n==0){
            return 1;
        }
        return a*print(a,n-1);
    }}
