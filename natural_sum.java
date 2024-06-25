class natural_sum {
    public static void main(String[] args) {
        int sum = 5;
        System.out.println(print(sum));
    }
    public static int print(int n){
        if(n==1){
            return 1;
        }
        return n+print(n-1);
}
}