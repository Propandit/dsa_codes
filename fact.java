public class fact {
    public static void main(String[] args) {
    
        int ans=print(5);
    System.out.println(ans);
}
    private static int print(int n){
        
        if(n==1){
            return 1;
            }
        
        return  n*print(n-1);
        
}
}